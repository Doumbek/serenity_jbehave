package serenity.yakush.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.yakush.widgets.impl.EmailWidgetImpl;

@ImplementedBy(EmailWidgetImpl.class)
public interface EmailWidget extends BaseWidget {

	WebElementFacade getEmailInput();

	WebElementFacade getNextButton();

	WebElementFacade getEmailErrorAlert();

}
