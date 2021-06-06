package com.sophossolutions.tasks;

import java.util.Map;

import com.sophossolutions.constants.AuthenticationConstants;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class GoRestPutTask implements Task{
	private String endpoint;
	private Map<String, String> bodyPut;
	
	public GoRestPutTask(String endpoint, DataTable bodyPut) {
		this.endpoint = endpoint;
		this.bodyPut = bodyPut.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Put.to(endpoint.concat(PostToken.IdSession)).with(request -> request.header(AuthenticationConstants.CONTENT_TYPE, 
				AuthenticationConstants.JSON).auth().oauth2(AuthenticationConstants.ACCES_TOKEN).body(bodyPut)));
		
	}
	
	public static  GoRestPutTask putTask(String endpoint, DataTable dataTable) {
		return Tasks.instrumented(GoRestPutTask.class, endpoint, dataTable);
	}
	
	

}
