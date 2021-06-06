package com.sophossolutions.tasks;

import java.util.List;
import com.sophosolutions.models.Comment;
import com.sophossolutions.constants.AuthenticationConstants;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostToken implements Task{
	public static final String IdSession= Serenity.sessionVariableCalled("id");
	
	private String endpoint;
	private List<Comment> body;
	
	public PostToken(String endpoint, DataTable body) {
		this.endpoint = endpoint;
		this.body = body.asList(Comment.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Post.to(endpoint).with(request -> request.header(AuthenticationConstants.CONTENT_TYPE,
				AuthenticationConstants.JSON).auth().oauth2(AuthenticationConstants.ACCES_TOKEN).body(body.get(0))));
		actor.remember("id", SerenityRest.lastResponse().jsonPath().get("data.id").toString());
				SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static PostToken PostCreate(String endpoint,DataTable body) {
		return Tasks.instrumented(PostToken.class, body);
	}

}
