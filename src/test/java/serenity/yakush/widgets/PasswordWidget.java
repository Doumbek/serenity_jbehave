package serenity.yakush.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.yakush.widgets.impl.PasswordWidgetImpl;

@ImplementedBy(PasswordWidgetImpl.class)
public interface PasswordWidget extends BaseWidget {

	WebElementFacade getPasswordInput();

	WebElementFacade getLoginButton();

	WebElementFacade getErrorAlert();

}
