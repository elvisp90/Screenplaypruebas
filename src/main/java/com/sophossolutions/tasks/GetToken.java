package com.sophossolutions.tasks;

import com.sophossolutions.constants.AuthenticationConstants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetToken implements Task {

	private String endPoint;
	private String id;

	public GetToken(String endPoint, String id) {
		this.endPoint = endPoint;
		this.id = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(endPoint.concat(id))
				.with(request -> request.auth().oauth2(AuthenticationConstants.ACCES_TOKEN)));
//		SerenityRest.lastResponse().prettyPeek(); 
		actor.remember("post", SerenityRest.lastResponse().jsonPath().get("data.body").toString());
		System.out.println("------------------------ "+ actor.recall("post"));
	}

	public static GetToken resource(String endPoint, String id) {
		return Tasks.instrumented(GetToken.class, endPoint, id);
	}

}
