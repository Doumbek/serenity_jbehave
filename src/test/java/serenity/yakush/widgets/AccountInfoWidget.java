package serenity.yakush.widgets;


import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.yakush.widgets.impl.AccountInfoWidgetImpl;

@ImplementedBy(AccountInfoWidgetImpl.class)
public interface AccountInfoWidget extends BaseWidget {

	WebElementFacade getLogoutButton();

}
