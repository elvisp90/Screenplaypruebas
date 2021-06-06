package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.GuruNewCustomer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task {

	private String name;
	private String genero;
	private String fecha;
	private String direccion;
	private String ciudad;
	private String estado;
	private String pin;
	private String telefono;
	private String correo;
	private String contrasena;

	public Registro(String name, String genero, String fecha, String direccion, String ciudad,
			String estado, String pin, String telefono, String correo, String contrasena) {
		this.name = name;
		this.genero = genero;
		this.fecha = fecha;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.pin = pin;
		this.telefono = telefono;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GuruNewCustomer.N_USUARIO),
				Enter.theValue(name).into(GuruNewCustomer.NAME),Click.on(GuruNewCustomer.GENERO.of(genero)),
				Enter.theValue(fecha).into(GuruNewCustomer.FECHA), Enter.theValue(direccion).into(GuruNewCustomer.DIRECCION),
				Enter.theValue(ciudad).into(GuruNewCustomer.CUIDAD), Enter.theValue(estado).into(GuruNewCustomer.ESTADO),
				Enter.theValue(pin).into(GuruNewCustomer.PIN), Enter.theValue(telefono).into(GuruNewCustomer.MOVILE),
				Enter.theValue(correo).into(GuruNewCustomer.CORREO), Enter.theValue(contrasena).into(GuruNewCustomer.CONTRASENA),
				Click.on(GuruNewCustomer.BTN_SUBMIT));
	}

	public static Registro in (String name, String genero, String fecha, String direccion, String ciudad,
			String estado, String pin, String telefono, String correo, String contrasena) {
		return Tasks.instrumented(Registro.class, name, genero, fecha, direccion, ciudad,
				estado, pin, telefono, correo, contrasena);
	}
}
