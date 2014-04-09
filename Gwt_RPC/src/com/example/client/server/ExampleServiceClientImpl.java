package com.example.client.server;

import java_cup.Main;

import com.example.client.gui.MaiGUI;
import com.example.client.gui.Person;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ExampleServiceClientImpl  implements ExampleServiceClientInt {
	 private ExampleServiceAsync service;
		private MaiGUI maingui;
		private PersonLoginPage loginpage;
		
		//private Survey survey;
		public ExampleServiceClientImpl(String url){
			System.out.println(url);
			this.service=GWT.create(ExampleService.class);
			ServiceDefTarget endpoint=(ServiceDefTarget) this.service;
					endpoint.setServiceEntryPoint(url);
			this.maingui=new MaiGUI(this);
			this.loginpage=new PersonLoginPage(this);
		}

		
		@Override
		public void getPerson(String name, String surname, int password) {
			this.service.getPerson(name,  surname, password,new DefaultCallback());
			
		}

		@Override
		public void sayHello(String name) {
			
			this.service.sayHello(name, new DefaultCallback());
		}
		
		public MaiGUI getMainGUI(){
			return this.maingui;
		}
		
		public PersonLoginPage getLoginGui(){
			return this.loginpage;
		}
		
		
		private class DefaultCallback implements AsyncCallback{

			@Override
			public void onFailure(Throwable caught) {
				System.out.println("error");
				
			}

			@Override
			public void onSuccess(Object result) {
			loginpage.handleEvent(result);
				
			}
			
		}
}
