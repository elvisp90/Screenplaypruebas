package com.sophossolutions.tasks;

import static com.sophossolutions.userinterfaces.OptionInTheSamePage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

public class YourDressesLogoTask implements Task {
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(MoveMouse.to(HOVER),MoveMouse.to(OP_CASUALD),Click.on(OP_CASUALD),
				Scroll.to(IMG),MoveMouse.to(IMG), MoveMouse.to(OP_QUICKVIEW), Click.on(OP_QUICKVIEW));
		actor.attemptsTo(Switch.toFrame(0));
	}
	
	public static YourDressesLogoTask goDresses() {
		return Tasks.instrumented(YourDressesLogoTask.class);
	}
}
