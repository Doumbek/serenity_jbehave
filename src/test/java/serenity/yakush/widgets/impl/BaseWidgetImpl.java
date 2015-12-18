package serenity.yakush.widgets.impl;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import serenity.yakush.widgets.BaseWidget;

abstract public class BaseWidgetImpl extends WidgetObjectImpl implements BaseWidget {

	public BaseWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public BaseWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}
	
}
