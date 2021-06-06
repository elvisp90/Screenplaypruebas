package com.sophossolutions.tasks;

import static com.sophossolutions.userinterfaces.YourDressesViewNewWindows.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class YourDressesLogoChoose implements Task  {
	private String cantidad;
	private String talla;
	
	
	public YourDressesLogoChoose(String cantidad, String talla) {
		this.cantidad = cantidad;
		this.talla = talla;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(cantidad).into(CHOOSE_NUMBER.of(cantidad)),
				Click.on(OP_SIZE),Click.on(CHOOSE_SIZE.of(talla)),Click.on(BTN_ADD_TO_CART));
		WaitUntil.the(BTN_ADD_TO_CART, isVisible());
		actor.attemptsTo(Click.on(BTN_PROCEED));
		
	
	}
	
	public static YourDressesLogoChoose goChoose(String cantidad , String talla) {
		return Tasks.instrumented(YourDressesLogoChoose.class, cantidad, talla);
	}
}
