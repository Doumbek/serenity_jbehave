package serenity.yakush.steps.serenity;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import serenity.yakush.bo.User;
import serenity.yakush.pages.InboxPage;
import serenity.yakush.pages.LoginPage;


import static org.junit.Assert.assertTrue;


public class AuthorizationSteps extends ScenarioSteps {

	LoginPage loginPage;
	InboxPage inboxPage;

	@Step
	public void goToLoginPage() {
		loginPage.open();
	}

	@Step
	public void inputEmail(String email) {
		loginPage.getLoginFormWidget().getEmailWidget().getEmailInput().sendKeys(email);
	}

	@Step
	public void clickNextButton() {
		loginPage.getLoginFormWidget().getEmailWidget().getNextButton().click();
	}

	@Step
	public void inputPassword(String password) {
		loginPage.getLoginFormWidget().getPasswordWidget().getPasswordInput().sendKeys(password);
	}

	@Step
	public void clickLoginButton() {
		loginPage.getLoginFormWidget().getPasswordWidget().getLoginButton().click();
	}

	@Step
	public void clickAccountLink() {
		inboxPage.getHeaderBlock().getAccountLink().click();
	}

	@Step
	public void clickLogoutButton() {
		inboxPage.getHeaderBlock().getAccountInfoWidget().getLogoutButton().click();
	}

	@Step
	public void checkAccountLinkIsDisplayed() {
		assertTrue(
				"Account link for authorized user must be presented!",
				inboxPage.getHeaderBlock().getAccountLink().isDisplayed()
		);
	}


	@Step
	public void checkEmailErrorAlertIsDisplayed() {
		assertTrue(
				"Email alert must be displayed!",
				loginPage.getLoginFormWidget().getEmailWidget().getEmailErrorAlert().isDisplayed()
		);
	}

	@Step
	public void checkPasswordErrorAlertIsDisplayed() {
		assertTrue(
				"Password alert must be displayed!",
				loginPage.getLoginFormWidget().getPasswordWidget().getPasswordErrorAlert().isDisplayed()
		);
	}

	@Step
	public void checkLoginFormIsDisplayed() {
		assertTrue(
				"Login form must be presented after logout!",
				loginPage.getLoginFormWidget().isDisplayed()
		);
	}

	@StepGroup
	public void login(User user) {
		inputEmail(user.getEmail());
		clickNextButton();
		inputPassword(user.getPassword());
		clickLoginButton();
	}

	@StepGroup
	public void login(String email, String password) {
		inputEmail(email);
		clickNextButton();
		inputPassword(password);
		clickLoginButton();
	}


	@StepGroup
	public void logout() {
		clickAccountLink();
		clickLogoutButton();
	}


}
