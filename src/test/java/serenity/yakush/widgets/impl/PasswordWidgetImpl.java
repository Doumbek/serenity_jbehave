package serenity.yakush.widgets.impl;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import serenity.yakush.widgets.PasswordWidget;

public class PasswordWidgetImpl extends BaseWidgetImpl implements PasswordWidget {

	@FindBy(xpath = ".//input[@id = 'Passwd']")
	private WebElementFacade passwordInput;

	@FindBy(xpath = ".//input[@id = 'signIn']")
	private WebElementFacade loginButton;

	@FindBy(xpath = ".//span[@id = 'errormsg_0_Passwd']")
	private WebElementFacade passwordErrorAlert;

	public PasswordWidgetImpl(net.serenitybdd.core.pages.PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public PasswordWidgetImpl(net.serenitybdd.core.pages.PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public WebElementFacade getPasswordInput() {
		return passwordInput;
	}

	public WebElementFacade getLoginButton() {
		return loginButton;
	}

	public WebElementFacade getPasswordErrorAlert() {
		return passwordErrorAlert;
	}

}
