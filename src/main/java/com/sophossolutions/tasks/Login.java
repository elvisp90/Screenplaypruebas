package com.sophossolutions.tasks;

import com.sophossolutions.userinterfaces.LoginPageGuru;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
//	Se crean las variables de los campos a utilizar 
	private String user;
	private String password;

	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(LoginPageGuru.USER_NAME),
				Enter.theValue(password).into(LoginPageGuru.PASSWORD), Click.on(LoginPageGuru.BTN_LOGIN));
	}

	public static Login in(String user, String password) {
		return Tasks.instrumented(Login.class, user, password);
	}

}
