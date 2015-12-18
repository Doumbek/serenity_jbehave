package serenity.yakush.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import serenity.yakush.widgets.HeaderWidget;

@DefaultUrl("https://mail.google.com/mail/u/0/#inbox")
public class InboxPage extends PageObject {

	@FindBy(xpath = "//div[@role='banner']")
	private HeaderWidget headerWidget;

	public HeaderWidget getHeaderBlock() {
		return headerWidget;
	}

}
