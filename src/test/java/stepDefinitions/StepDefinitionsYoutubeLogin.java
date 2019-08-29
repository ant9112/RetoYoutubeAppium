package stepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.StringContains.containsString;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.QuestionUserLoged;
import tasks.LoadApplication;
import tasks.LoginTask;


public class StepDefinitionsYoutubeLogin {

	@Before
	public void setTheStage() {
	    OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^I want to open the YoutubeApp$")
	public void iWantToOpenTheYoutubeApp() {
		aNewActor().wasAbleTo(LoadApplication.loadApplication());
	}

	@When("^I login with username '(.*)' and password '(.*)'$")
	public void iLoginWithUsernameAndPassword(String username, String password) {
		theActorInTheSpotlight().attemptsTo(LoginTask.loginWith(username, password));
	}

	@Then("^I should see my name '(.*)' in the profile section$")
	public void iShouldSeeMyNameInTheProfileSection(String expectedName) {
		 theActorInTheSpotlight()
		 .should(
				 seeThat(
						QuestionUserLoged.value(), containsString(expectedName)
						 )
				 );
	}

}
