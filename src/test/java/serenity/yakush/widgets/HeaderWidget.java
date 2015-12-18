package serenity.yakush.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.yakush.widgets.impl.HeaderWidgetImpl;

@ImplementedBy(HeaderWidgetImpl.class)
public interface HeaderWidget extends BaseWidget {

	AccountInfoWidget getAccountInfoWidget();

	WebElementFacade getAccountLink();
}
