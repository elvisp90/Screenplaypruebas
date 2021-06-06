package com.sophossolutions.tasks;


import static com.sophossolutions.userinterfaces.YourDressesLogoLogin.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sophossolutions.questions.TextOf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class YourDressesLogoLoginTask implements Task {
	private static final Logger LOG = LoggerFactory.getLogger(YourDressesLogoTask.class.getCanonicalName());
	
	private String user;
	private String pass;
	private String validacion;

	public YourDressesLogoLoginTask(String user, String pass, String validacion) {
		this.user = user;
		this.pass = pass;
		this.validacion = validacion;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember("price", TextOf.field(PRICE));
		actor.attemptsTo(Scroll.to(PRICE),Click.on(BTN_PROCEED_SUMMARY),Enter.theValue(user).into(USUARIO),
				Enter.theValue(pass).into(PASSWORD), Click.on(BTN_LOGIN),Click.on(BTN_PROCEED_ADDRESS),
				Click.on(ADDTERMINOS),Click.on(BTN_CARRIER),Click.on(PAY_BANK),	Click.on(BTN_CONFIRM));
//		LOG.info(pass);
		actor.should(seeThat(TextOf.field(TEXTO.of(validacion)), equalTo(validacion)));
		actor.recall("precio").equals(TextOf.field(PRICE));

	}
  
	public static YourDressesLogoLoginTask goAdress(String user, String pass, String validacion) {
		return Tasks.instrumented(YourDressesLogoLoginTask.class, user,  pass, validacion);
	}

}
