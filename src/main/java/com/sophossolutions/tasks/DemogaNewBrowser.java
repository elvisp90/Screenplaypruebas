package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.DemogaBrowserWindows;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DemogaNewBrowser implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DemogaBrowserWindows.OP_BROWSERW));
	}
	
	public static DemogaNewBrowser newB () {
		return Tasks.instrumented(DemogaNewBrowser.class);
	}

}
