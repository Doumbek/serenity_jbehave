package serenity.yakush.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import serenity.yakush.widgets.impl.LoginFormWidgetImpl;

@ImplementedBy(LoginFormWidgetImpl.class)
public interface LoginFormWidget extends BaseWidget {

	EmailWidget getEmailWidget();

	PasswordWidget getPasswordWidget();

}
