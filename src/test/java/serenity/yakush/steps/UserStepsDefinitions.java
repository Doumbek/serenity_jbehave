package serenity.yakush.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import serenity.yakush.steps.serenity.AuthorizationSteps;


public class UserStepsDefinitions {

	@Steps
	AuthorizationSteps user;

	@Given("the user on a login page")
	public void givenThenUserOnLoginPage() {
		user.goToLoginPage();
	}

	@When("the user try to login with correct <login> and <password>")
	public void whenUserTryToLoginWithCorrectCredentials(@Named("login") String login, @Named("password") String password) {
		user.login(login, password);
	}

	@Then("the user is logged in")
	public void thenUserIsLoggedIn() {
		user.checkAccountLink();
	}

}
