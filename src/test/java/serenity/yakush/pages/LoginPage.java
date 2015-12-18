package serenity.yakush.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import serenity.yakush.widgets.LoginFormWidget;

@DefaultUrl("https://accounts.google.com/")
public class LoginPage extends PageObject {

	@FindBy(xpath = "//form[@id = 'gaia_loginform']")
	private LoginFormWidget loginFormWidget;

	public LoginFormWidget getLoginFormWidget() {
		return loginFormWidget;
	}
}
