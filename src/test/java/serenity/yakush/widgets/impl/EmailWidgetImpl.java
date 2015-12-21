package serenity.yakush.widgets.impl;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import serenity.yakush.widgets.EmailWidget;

public class EmailWidgetImpl extends BaseWidgetImpl implements EmailWidget {

	@FindBy(xpath = ".//input[@id = 'Email']")
	private WebElementFacade emailInput;

	@FindBy(xpath = ".//input[@id = 'next']")
	private WebElementFacade nextButton;

	@FindBy(xpath = ".//span[@id = 'errormsg_0_Email']")
	private WebElementFacade emailErrorAlert;

	public EmailWidgetImpl(net.serenitybdd.core.pages.PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public EmailWidgetImpl(net.serenitybdd.core.pages.PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public WebElementFacade getEmailInput() {
		return emailInput;
	}

	public WebElementFacade getNextButton() {
		return nextButton;
	}

	public WebElementFacade getEmailErrorAlert() {
		return emailErrorAlert;
	}

}
