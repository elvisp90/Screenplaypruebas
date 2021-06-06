package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.DemogaAlertPromptTask;
import com.sophossolutions.tasks.DemogaAlertTask;
import static com.sophossolutions.userinterfaces.DemogaBrowserWindows.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemogaAlertStepDefinition {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("{string} necesita ir a la pagina {string}")
	public void necesitaIrALaPagina(String semillero, String url) {
		theActorCalled(semillero).wasAbleTo(Open.url(url));
	}

	@Given("va al boton {string} y da aceptar")
	public void vaAlBotonYDaAceptar(String alertButton) {
		theActorInTheSpotlight().attemptsTo(DemogaAlertTask.goAlert(alertButton));
	}

	@When("va al boton {string} y realiza una espera y acepta")
	public void vaAlBotonYRealizaUnaEsperaYAcepta(String timerAlertButton) {
		theActorInTheSpotlight().attemptsTo(DemogaAlertTask.goAlert(timerAlertButton));
	}

	@When("va a la boton {string} y verifica el texto {string}")
	public void vaALaBotonYVerificaElTexto(String confirmButton, String texto) {
		theActorInTheSpotlight().attemptsTo(DemogaAlertTask.goAlert(confirmButton));
		theActorInTheSpotlight().should(seeThat(TextOf.field(TITLE.of(texto)),equalTo(texto)));
	}

	@Then("va al boton {string} ingresa el texto {string} y valida que el texto sea {string}")
	public void vaAlBotonIngresaElTextoYValidaQueElTextoSea(String btnPrompt, String prompt, String textConfirm) {
	theActorInTheSpotlight().attemptsTo(DemogaAlertPromptTask.sendAlert(btnPrompt, prompt));
	theActorInTheSpotlight().should(seeThat(TextOf.field(TEXT_ALERT_CONFIRM.of(textConfirm)), equalTo(textConfirm)));
	}
	

}
