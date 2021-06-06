package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.*;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.Registro;
import com.sophossolutions.userinterfaces.GuruNewCustomerRegistered;

public class GuruNewCustomerStepDefinition {
	
	
	 @Before public void setup() { setTheStage(new OnlineCast()); }
	
	@When("{string} ingresa al aparatado Nuevo Usuario")
	public void ingresaAlAparatadoNuevoUsuario(String apartadoNU) {
		theActorCalled(apartadoNU);
	}


	@When("Diligencia el formulario con los siguientes datos nombre {string}, genero {string}, fecha {string}, direccion {string}, ciudad {string}, estado {string}, pin {string}, telefono {string}, correo {string}, contrasena {string}")
	public void diligenciaElFormularioConLosSiguientesDatosNombreGeneroFechaDireccionCiudadEstadoPinTelefonoCorreoContraseA(String nombre, String genero, String fecha, String direccion, String ciudad, String estado, String pin, String telefono, String correo, String contrasena) {
	theActorInTheSpotlight().attemptsTo(Registro.in(nombre, genero, fecha, direccion, ciudad, estado, pin, telefono, correo, contrasena));
	}


	@Then("Valida que el titulo sea el siguiente {string}")
	public void validaQueElTituloSeaElSiguiente(String text) {
		theActorInTheSpotlight().should(seeThat(TextOf.field(GuruNewCustomerRegistered.TITULO.of(text)), equalTo(text)));
		
	}

	

}
