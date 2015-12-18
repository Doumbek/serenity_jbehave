package serenity.yakush.widgets.impl;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import serenity.yakush.widgets.AccountInfoWidget;

public class AccountInfoWidgetImpl extends BaseWidgetImpl implements AccountInfoWidget {

	@FindBy(xpath = ".//a[text() = 'Выйти']")
	private WebElementFacade logoutButton;

	public AccountInfoWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public AccountInfoWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public WebElementFacade getLogoutButton() {
		return logoutButton;
	}

}
