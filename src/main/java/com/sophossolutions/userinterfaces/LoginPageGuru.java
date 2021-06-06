package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageGuru {

	public static final Target USER_NAME = Target.the("Campo nombre de usuario").locatedBy("name:uid");
	public static final Target PASSWORD = Target.the("Campo password").locatedBy("name:password");
	public static final Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//*[@value='LOGIN']");

}
