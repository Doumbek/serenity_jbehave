package serenity.yakush.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import serenity.yakush.steps.serenity.AuthorizationSteps;


public class UserStepsDefinitions {

	@Steps
	AuthorizationSteps user;

	@Given("the user on a login page")
	public void givenTheUserOnLoginPage() {
		user.goToLoginPage();
	}

	@Given("the user with email: '$email' and password: '$password' is logged in")
	public void givenTheUserIsLoggedIn(String email, String password) {
		user.goToLoginPage();
		user.login(email, password);
	}

	@When("the user try to login with correct email: $email and password: $password")
	public void whenUserTryToLoginWithCorrectCredentials(String email, String password) {
		user.login(email, password);
	}

	@When("the user try to login with incorrect email: $email")
	public void whenUserTryToLoginWithIncorrectEmail(String email) {
		user.inputEmail(email);
		user.clickNextButton();
	}

	@When("the user try to login with correct email: $email and incorrect password: $password")
	public void whenUserTryToLoginWithIncorrectPassword(String email, String password) {
		user.login(email, password);
	}

	@When("the user try to logout")
	public void whenUserTryToLogout() {
		user.logout();
	}

	@Then("the user is logged in")
	public void thenUserIsLoggedIn() {
		user.checkAccountLinkIsDisplayed();
	}

	@Then("email error alert is displayed")
	public void thenEmailErrorAlertIsDisplayed() {
		user.checkEmailErrorAlertIsDisplayed();
	}

	@Then("password error alert is displayed")
	public void thenPasswordErrorAlertIsDisplayed() {
		user.checkPasswordErrorAlertIsDisplayed();
	}

	@Then("login form is displayed")
	public void thenLoginFormIsDisplayed() {
		user.checkLoginFormIsDisplayed();
	}

}
