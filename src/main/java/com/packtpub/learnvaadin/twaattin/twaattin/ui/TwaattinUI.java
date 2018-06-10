package com.packtpub.learnvaadin.twaattin.twaattin.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;

import static com.vaadin.server.Sizeable.Unit.PIXELS;

@SpringUI
public class TwaattinUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		HorizontalSplitPanel panel = new HorizontalSplitPanel();

		panel.setFirstComponent(new LoginScreen());
		panel.setSecondComponent(new TimelineScreen());
		panel.setSplitPosition(300, PIXELS);

		setContent(panel);
	}
}
