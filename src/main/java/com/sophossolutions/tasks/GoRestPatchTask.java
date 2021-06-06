package com.sophossolutions.tasks;

import java.util.Map;

import com.sophossolutions.constants.AuthenticationConstants;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Patch;

public class GoRestPatchTask implements Task{
	
	private String endpoint;
	private Map<String, String> bodyPatch;
	
	
	public GoRestPatchTask(String endpoint, DataTable bodyPatch) {
		this.endpoint = endpoint;
		this.bodyPatch = bodyPatch.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Patch.to(endpoint).with(response -> response.header(AuthenticationConstants.CONTENT_TYPE,
				AuthenticationConstants.JSON).auth().oauth2(AuthenticationConstants.ACCES_TOKEN).body(bodyPatch)));
	}
	
	public static GoRestPatchTask PatchTask(String endpoint, DataTable dataTable) {
		return Tasks.instrumented(GoRestPatchTask.class, endpoint, dataTable );
	}

}
