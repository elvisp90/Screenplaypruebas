package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.*;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.tasks.Login;
import com.sophossolutions.userinterfaces.HomePageGuru;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GuruLoginStepDefinition {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} desea ir a la pagina de {string}")
	public void deseaIrALaPaginaDe(String actorName, String url) {
		theActorCalled(actorName).wasAbleTo(Open.url(url));
	}


	 @When("Ingresa nombre de usuario {string} y password {string}") 
	 public void ingresaNombreDeUsuarioYPassword(String userName, String password) {
	 theActorInTheSpotlight().attemptsTo(Login.in(userName, password)); }
	

	@Then("Valida que el titulo sea {string}")
	public void validaQueElTituloSea(String text) {
		theActorInTheSpotlight().should(seeThat(TextOf.field(HomePageGuru.TITLE.of(text)), equalTo(text)));
	}

}
