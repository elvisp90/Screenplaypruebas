package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.BrowsweBtn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

public class DemogaBtn implements Task {
	
	private String btn;
	public DemogaBtn(String btn) {
		this.btn=btn;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BrowsweBtn.NEWTAB.of(btn)));
		actor.attemptsTo(Switch
				.toWindow(BrowseTheWeb.as(actor).getDriver().getWindowHandles().stream().skip(1).findFirst().get()));
	}

	public static DemogaBtn nt(String btn) {
		return Tasks.instrumented(DemogaBtn.class, btn);
	}
}
