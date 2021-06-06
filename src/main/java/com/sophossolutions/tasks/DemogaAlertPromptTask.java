package com.sophossolutions.tasks;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.userinterfaces.DemogaBrowserWindows;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

public class DemogaAlertPromptTask implements Task{
	
	private String btnPrompt;
	private String prompt;
	
	
	public DemogaAlertPromptTask(String btnPrompt,String prompt) {
		this.btnPrompt = btnPrompt;
		this.prompt = prompt;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		actor.attemptsTo(Click.on(DemogaBrowserWindows.BTN_ALERT.of(btnPrompt)));
		actor.attemptsTo(Switch
				.toWindow(BrowseTheWeb.as(actor).getDriver().getWindowHandles().stream().skip(2).findFirst().get()));
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys(prompt);
	}
	
	public static DemogaAlertPromptTask sendAlert(String btnPrompt, String prompt) {
		return Tasks.instrumented(DemogaAlertPromptTask.class, btnPrompt, prompt);
	}

}
