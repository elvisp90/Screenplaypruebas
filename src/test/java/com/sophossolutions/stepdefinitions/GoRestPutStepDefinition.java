package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GoRestPutTask;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class GoRestPutStepDefinition {
	
	@When("con endpoint {string} para modificar el usuario con un put")
	public void conEndpointParaModificarElUsuarioConUnPut(String endpoint, DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(GoRestPutTask.putTask(endpoint, dataTable));
	}

}
