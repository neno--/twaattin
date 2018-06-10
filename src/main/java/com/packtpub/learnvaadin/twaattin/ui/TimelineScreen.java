package com.packtpub.learnvaadin.twaattin.ui;

import com.packtpub.learnvaadin.twaattin.presenter.LogoutBehavior;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.security.Principal;

public class TimelineScreen extends VerticalLayout {

	public TimelineScreen() {
		Label label = new Label(VaadinSession.getCurrent()
				.getAttribute(Principal.class).getName());
		Button button = new Button("Logout");
		button.addClickListener(new LogoutBehavior());
		HorizontalLayout menuBar = new HorizontalLayout(label,
				button);
		addComponent(menuBar);
		fillTweets();
	}

	public void fillTweets() {
		for (int i = 0; i < 10; i++) {
			Label label = new Label();
			label.setValue("Lorem ipsum dolor sit amet, consectetur "
					+ "adipisicing elit, sed do eiusmod tempor incididunt "
					+ "ut labore et dolore magna aliqua. Ut enim ad minim "
					+ "veniam, quis nostrud exercitation ullamco laboris "
					+ "nisi ut aliquip ex ea commodo consequat.");
			addComponent(label);
		}
	}
}