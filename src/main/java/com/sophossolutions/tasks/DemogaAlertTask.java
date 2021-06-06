package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.DemogaBrowserWindows;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DemogaAlertTask implements Task{
	
	private String nameButton;

	public DemogaAlertTask(String button) {
		this.nameButton=button; 
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DemogaBrowserWindows.BTN_ALERT.of(nameButton)));
	}
	
	public static DemogaAlertTask goAlert(String nameButton) {
		return Tasks.instrumented(DemogaAlertTask.class, nameButton);
	}
	

}
