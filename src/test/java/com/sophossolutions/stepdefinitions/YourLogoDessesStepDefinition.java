package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.tasks.YourDressesLogoChoose;
import com.sophossolutions.tasks.YourDressesLogoLoginTask;
import com.sophossolutions.tasks.YourDressesLogoTask;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class YourLogoDessesStepDefinition {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} se dirige a la pagina {string}")
	public void seDirigeALaPagina(String actor, String url) {
		theActorCalled(actor).wasAbleTo(Open.url(url));
	}
	//		theActorInTheSpotlight().attemptsTo(YourDressesLogoTask.goAdresses(dresses));


	@When("Va a la opcion de Dresses y casual dresses y Quick view")
	public void vaALaOpcionDeDressesYCasualDressesYQuickView() {
		theActorInTheSpotlight().attemptsTo(YourDressesLogoTask.goDresses());
	}


	@When("Elige {string} vestidos con talla {string} verifica la compra")
	public void eligeVestidosConTallaVerificaLaCompra(String number, String size) {
		theActorInTheSpotlight().attemptsTo(YourDressesLogoChoose.goChoose(number, size));
	}

	
	@Then("ingresa usuario {string} y contrasena {string} y verificamos que el texto sea {string}")
	public void ingresaUsuarioYContrasenaYVerificamosQueElTextoSea(String user, String pass, String validacion) {
		theActorInTheSpotlight().attemptsTo(YourDressesLogoLoginTask.goAdress(user, pass, validacion));
	 
	}



	
	
}