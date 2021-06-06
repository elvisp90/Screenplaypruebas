package com.sophossolutions.actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Wait {
	public static WebDriverWait waitfor(Actor actor, Integer time) {
	    return new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), time);
	}

}
