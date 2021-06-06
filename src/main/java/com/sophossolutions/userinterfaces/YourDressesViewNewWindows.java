package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourDressesViewNewWindows {

	public static final Target CHOOSE_NUMBER = Target.the("Elige la cantidad").locatedBy("//*[@id='quantity_wanted']");
	public static final Target CHOOSE_SIZE = Target.the("Elige la talla").locatedBy("//option[@title='{0}']"); ;
	public static final Target BTN_ADD_TO_CART = Target.the("boton add to cart").locatedBy("name:Submit");
	public static final Target OP_SIZE = Target.the("OPCION DE LA TALLA").locatedBy("//*[@id='uniform-group_1']");
	public static final Target BTN_PROCEED = Target.the("Boton proceed").locatedBy("//*[@class='btn btn-default button button-medium']");
	
}
