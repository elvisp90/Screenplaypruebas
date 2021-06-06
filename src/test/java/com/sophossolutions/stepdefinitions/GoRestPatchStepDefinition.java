package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.GoRestPatchTask;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class GoRestPatchStepDefinition {
	
	@When("se le envia el endpoint {string} y los datos")
	public void seLeEnviaElEndpointYLosDatos(String enpoint, DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(GoRestPatchTask.PatchTask(enpoint, dataTable));
		
	}


}
