package com.packtpub.learnvaadin.twaattin.presenter;

import com.packtpub.learnvaadin.authentication.AuthenticationException;
import com.packtpub.learnvaadin.authentication.SimpleUserPasswordAuthenticationStrategy;
import com.packtpub.learnvaadin.twaattin.ui.TimelineScreen;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

import java.security.Principal;

import static com.vaadin.ui.Notification.Type.ERROR_MESSAGE;

public class LoginBehavior implements Button.ClickListener {
	private final TextField loginField;
	private final PasswordField passwordField;

	public LoginBehavior(TextField loginField,
						 PasswordField passwordField) {
		this.loginField = loginField;
		this.passwordField = passwordField;
	}

	@Override
	public void buttonClick(Button.ClickEvent event) {
		try {
			String login = loginField.getValue();
			String password = passwordField.getValue();
			Principal user =
					new SimpleUserPasswordAuthenticationStrategy()
							.authenticate(login, password);

			VaadinSession.getCurrent().setAttribute(
					Principal.class, user);
			UI.getCurrent().setContent(new TimelineScreen());
			Notification.show("You're authenticated into Twaattin");

		} catch (AuthenticationException e) {
			Notification.show(e.getMessage(), ERROR_MESSAGE);
		}
	}
}
