package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GuruNewCustomer {
	public static final Target N_USUARIO = Target.the("apartado nuevo usuario").locatedBy("//*[@href=\"addcustomerpage.php\"]");
	public static final Target NAME = Target.the("nombre de usuario").locatedBy("name:name");
	public static final Target GENERO = Target.the("Genero").locatedBy("//*[@value='{0}']");
	public static final Target FECHA = Target.the("fecha").locatedBy("name:dob");
	public static final Target DIRECCION = Target.the("direccion").locatedBy("name:addr");
	public static final Target CUIDAD = Target.the("cuidad").locatedBy("name:city");
	public static final Target ESTADO = Target.the("Estado").locatedBy("name:state");
	public static final Target PIN = Target.the("Pin").locatedBy("name:pinno");
	public static final Target MOVILE = Target.the("Telefono").locatedBy("name:telephoneno");
	public static final Target CORREO = Target.the("Correo").locatedBy("name:emailid");
	public static final Target CONTRASENA = Target.the("Contrase�a").locatedBy("name:password");
	public static final Target BTN_SUBMIT = Target.the("Boton registrar").locatedBy("name:sub");

}
