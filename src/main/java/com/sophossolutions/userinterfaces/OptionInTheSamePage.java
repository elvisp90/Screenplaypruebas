package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionInTheSamePage {
	
	public static final Target HOVER = Target.the("opcion hover").locatedBy("//*[@id=\"block_top_menu\"]/ul/li[2]");
	public static final Target OP_CASUALD = Target.the("hover casual dresses").locatedBy("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]");
	
	public static final Target OP_QUICKVIEW =Target.the("opcion quick view").locatedBy("//*[@class= 'quick-view']");
	public static final Target IMG =Target.the("opcion quick view").locatedBy("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
	public static final Target BTN_CHECKOUT1 =Target.the("BTN checkout").locatedBy("//a[@class='button btn btn-default standard-checkout button-medium']");
	public static final Target SCROLL_SUMMARY =Target.the("Scroll Hasta precio").locatedBy("//*[@id='total_price_container']");

}
