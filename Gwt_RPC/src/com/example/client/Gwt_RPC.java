package com.example.client;

import com.example.client.server.ExampleServiceClientImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_RPC implements EntryPoint {
	
	public void onModuleLoad() {
		ExampleServiceClientImpl clientImpl=new ExampleServiceClientImpl(GWT.getModuleBaseURL() + "exampleservice");
	
		RootPanel.get().add(clientImpl.getLoginGui()); 
		//RootPanel.get().add(clientImpl.getMainGUI());
	}
}
