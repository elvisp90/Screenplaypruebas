package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemogaBrowserWindows {
	public static final Target OP_BROWSERW = Target.the("opcion browser")
			.locatedBy("/html/body/div/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]/span"); 

	public static final Target OP_ALERT = Target.the("opcion de alert")
			.locatedBy("//*[@id='item-1']");

	public static final Target BTN_ALERT = Target.the("btn alert")
			.locatedBy("//button[@id='{0}']");

	public static final Target TITLE = Target.the("confirma alert").locatedBy("//*[@id='confirmResult']");
	
	public static final Target TEXT_ALERT_CONFIRM = Target.the("alerta comfirm").locatedBy("//*[@id='promptResult']");
}
