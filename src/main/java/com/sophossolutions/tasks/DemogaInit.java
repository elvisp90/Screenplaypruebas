package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.DemogaWindowsHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class DemogaInit implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Scroll.to(DemogaWindowsHome.OPC_ALERTFRAMEW), Click.on(DemogaWindowsHome.OPC_ALERTFRAMEW));
	}
	
	public static DemogaInit inicio() {
		return Tasks.instrumented(DemogaInit.class);
	}

	
}
