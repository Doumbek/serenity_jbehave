package serenity.yakush.widgets.impl;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import serenity.yakush.widgets.EmailWidget;
import serenity.yakush.widgets.LoginFormWidget;
import serenity.yakush.widgets.PasswordWidget;

public class LoginFormWidgetImpl extends BaseWidgetImpl implements LoginFormWidget {

	@FindBy(xpath = ".//div[contains(@class, 'form-panel first')]")
	private EmailWidget emailWidget;

	@FindBy(xpath = ".//div[contains(@class, 'form-panel second')]")
	private PasswordWidget passwordWidget;

	public LoginFormWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public LoginFormWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public EmailWidget getEmailWidget() {
		return emailWidget;
	}

	public PasswordWidget getPasswordWidget() {

		if(!passwordWidget.isDisplayed()){
			throw new ElementNotVisibleException("Account information popup not visible");
		}

		return passwordWidget;

	}

}
