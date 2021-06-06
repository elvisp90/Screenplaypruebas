package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;



import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.tasks.DemogaNewBrowser;
import com.sophossolutions.tasks.DemogaBtn;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.DemogaInit;
import com.sophossolutions.userinterfaces.NewTabConfirmado;


public class DemogaWindowsStepDefinition {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}


	@Given("{string} ingrea a la pagina de {string}")
	public void ingreaALaPaginaDe(String usuario, String url) {
		theActorCalled(usuario).wasAbleTo(Open.url(url));
	}

	@Given("ingresa al apartado de alert, frame & windows")
	public void ingresaAlApartadoDeAlertFrameWindows() {
		theActorInTheSpotlight().attemptsTo(DemogaInit.inicio());
	}

	@When("ingresa a siguiente apartado de browser windows")
	public void ingresaASiguienteApartadoDeBrowserWindows() {
		theActorInTheSpotlight().attemptsTo(DemogaNewBrowser.newB());
	}
	
	@When("va al boton de {string}")
	public void vaAlBotonDeNewTab(String botonW) {
		theActorInTheSpotlight().attemptsTo(DemogaBtn.nt(botonW));
		
	}

	@Then("valida que el texto sea {string}")
	public void validaQueElTextoSea(String text) {
		theActorInTheSpotlight().should(seeThat(TextOf.field(NewTabConfirmado.TITULO.of(text)),equalTo(text)));
	}


	


}
