package com.example.client.gui;

import com.example.client.server.ExampleServiceClientImpl;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MaiGUI extends Composite {
	private VerticalPanel vPanel=new VerticalPanel();
	private ExampleServiceClientImpl serviceImpl;

public MaiGUI(ExampleServiceClientImpl serviceImpl){
//	initWidget(this.vPanel);
//	this.vPanel.setWidth("100%");
//	this.serviceImpl=serviceImpl;
//	 
//	//this.serviceImpl.getPerson(name, surname, password);
//	//this.vPanel.add(tx1);
//		
//	Button btn1=new Button("say hello");
//	btn1.addClickHandler(new Btn1ClickHandler());
//	this.vPanel.add(btn1);
//	
////	this.resultl=new Label("");
////    this.vPanel.add(resultl);	
//}
//public void updateLabel(String greeting ){
//	this.resultl.setText(greeting);
//	
//}
//private class Btn1ClickHandler implements ClickHandler{
//
//	@Override
//	public void onClick(ClickEvent event) {
//		String name=tx1.getText();
//		serviceImpl.sayHello(name);
//	}
//	
//}
}
}
