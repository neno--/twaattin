package com.packtpub.learnvaadin.twaattin.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI
public class TwaattinUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		setContent(new LoginScreen());
	}
}
