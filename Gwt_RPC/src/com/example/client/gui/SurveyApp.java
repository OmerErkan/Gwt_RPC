package com.example.client.gui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class SurveyApp extends Composite implements HasText {
	private ShowChart chart=new ShowChart();
	private static SurveyAppUiBinder uiBinder = GWT
			.create(SurveyAppUiBinder.class);
	@UiField Button button;

	interface SurveyAppUiBinder extends UiBinder<Widget, SurveyApp> {
	}

	public SurveyApp() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	
	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		//chart.onModuleLoad();
	}
}
