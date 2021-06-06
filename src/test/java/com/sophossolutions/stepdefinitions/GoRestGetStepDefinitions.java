package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GetToken;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.containsString;

public class GoRestGetStepDefinitions {
	
	@Given("{word} Desea ir a la api {string}")
	public void estudianteDeseaIrALaApi(String actorName, String baseUrl) {
		theActorCalled(actorName).whoCan(CallAnApi.at(baseUrl));
	}


	@When("Consulta el no se el {string} y consulto por {string}")
	public void consultaElNoSeElYConsultoPor(String endPoint, String id) {
		theActorInTheSpotlight().attemptsTo(GetToken.resource(endPoint, id));
	}

	@Then("Valida que la respuesta contenga {int} {string} {string}")
	public void validaQueLaRespuestaContenga(Integer statusCode, String name, String email) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(statusCode)
				.body(containsString(name)).and().body(containsString(email))));
	}
}
