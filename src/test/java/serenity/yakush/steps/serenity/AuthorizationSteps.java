package serenity.yakush.steps.serenity;


import net.thucydides.core.annotations.Step;
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
	public void inputLogin(String login) {
		loginPage.getLoginFormWidget().getEmailWidget().getEmailInput().sendKeys(login);
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
	public void checkErrorAlert() {
		assertTrue(
				"Alert must be displayed!",
				loginPage.getLoginFormWidget().getPasswordWidget().getErrorAlert().isDisplayed()
		);
	}

	@Step
	public void login(User user) {
		loginPage.getLoginFormWidget().getEmailWidget().getEmailInput().sendKeys(user.getLogin());
		loginPage.getLoginFormWidget().getEmailWidget().getNextButton().click();
		loginPage.getLoginFormWidget().getPasswordWidget().getPasswordInput().sendKeys(user.getPassword());
		loginPage.getLoginFormWidget().getPasswordWidget().getLoginButton().click();
	}

	@Step
	public void login(String login, String password) {
		loginPage.getLoginFormWidget().getEmailWidget().getEmailInput().sendKeys(login);
		loginPage.getLoginFormWidget().getEmailWidget().getNextButton().click();
		loginPage.getLoginFormWidget().getPasswordWidget().getPasswordInput().sendKeys(password);
		loginPage.getLoginFormWidget().getPasswordWidget().getLoginButton().click();
	}

	@Step
	public void checkLoginForm() {
		assertTrue(
				"Login form must be presented after logout!",
				loginPage.getLoginFormWidget().isDisplayed()
		);
	}

	@Step
	public void checkAccountLink() {
		assertTrue(
				"Account link for authorized user must be presented!",
				inboxPage.getHeaderBlock().getAccountLink().getWrappedElement().isDisplayed()
		);
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
	public void logout() {
		inboxPage.getHeaderBlock().getAccountLink().click();
		inboxPage.getHeaderBlock().getAccountInfoWidget().getLogoutButton().click();
	}

}
