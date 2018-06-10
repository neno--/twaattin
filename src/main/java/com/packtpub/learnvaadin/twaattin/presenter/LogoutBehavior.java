package com.packtpub.learnvaadin.twaattin.presenter;

import com.packtpub.learnvaadin.twaattin.ui.LoginScreen;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import java.security.Principal;

public class LogoutBehavior implements Button.ClickListener {
	private static final long serialVersionUID = 1L;

	@Override
	public void buttonClick(Button.ClickEvent event) {
		VaadinSession.getCurrent().setAttribute(Principal.class,
				null);
		UI.getCurrent().setContent(new LoginScreen());
		Notification.show("You've been logged out");
	}
}
