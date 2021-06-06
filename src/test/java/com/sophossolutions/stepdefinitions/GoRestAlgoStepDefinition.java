package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import com.sophossolutions.tasks.PostToken;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class GoRestAlgoStepDefinition {

	@When("Con el endpoint {string} y los datos")
	public void conElEndpointYLosDatos(String service, DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(PostToken.PostCreate(service, dataTable));

	}
}
