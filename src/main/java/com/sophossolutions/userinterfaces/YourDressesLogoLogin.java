package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourDressesLogoLogin {
	
	public static final Target BTN_PROCEED_ADDRESS =Target.the("Btn address").locatedBy("//*[@id='center_column']/form/p/button/span");
	public static final Target BTN_PROCEED_SUMMARY =Target.the("Btn summary").locatedBy("//*[@id='center_column']/p[2]/a[1]");
	public static final Target USUARIO =Target.the("Usuario").locatedBy("//*[@id='email']");
	public static final Target PASSWORD =Target.the("Password").locatedBy("//*[@id='passwd']");
	public static final Target BTN_LOGIN =Target.the("Boton Login").locatedBy("//*[@id='SubmitLogin']");
	public static final Target PRICE =Target.the("campo de precio total").locatedBy("//*[@id='total_price']");
	public static final Target SCROLL_ADDRESS =Target.the("Scroll ").locatedBy("//*[text()='Your billing address']");
	
	public static final Target SCROLL_SHIPPING =Target.the("Scroll shipping ").locatedBy("//*[@class='navigation_page']");
	public static final Target ADDTERMINOS =Target.the("campo de precio total").locatedBy("//*[@id='cgv']");
	public static final Target BTN_CARRIER =Target.the("Btn ").locatedBy("name:processCarrier");
	
	public static final Target PAY_BANK =Target.the("pago en banco").locatedBy("//*[@id='HOOK_PAYMENT']/div[1]/div");
	public static final Target SCROLL_CONFIRM =Target.the("Scroll confirm").locatedBy("//*[@id='block_top_menu']/ul/li[1]");
	public static final Target BTN_CONFIRM =Target.the("boton confirmar").locatedBy("//*[@id='cart_navigation']/button");
	public static final Target TEXTO =Target.the("Texto final").locatedBy("//*[@id='center_column']/div/p/strong");
}