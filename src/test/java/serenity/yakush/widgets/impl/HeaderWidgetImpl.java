package serenity.yakush.widgets.impl;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import serenity.yakush.widgets.AccountInfoWidget;
import serenity.yakush.widgets.HeaderWidget;

public class HeaderWidgetImpl extends BaseWidgetImpl implements HeaderWidget {

	@FindBy(xpath = ".//div[@aria-label='Информация об аккаунте']")
	private AccountInfoWidget accountInfoWidget;

	@FindBy(xpath = ".//a[contains(@href, 'https://accounts.google.com/SignOutOptions')]")
	private WebElementFacade accountLink;

	public HeaderWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public HeaderWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public AccountInfoWidget getAccountInfoWidget() {
		return accountInfoWidget;
	}

	public WebElementFacade getAccountLink() {
		return accountLink;
	}

}
