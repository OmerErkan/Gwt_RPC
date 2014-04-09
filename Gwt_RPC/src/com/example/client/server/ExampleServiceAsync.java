package com.example.client.server;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {
	void getPerson(String name,String surname,int password,AsyncCallback callback);
	void sayHello(String name,AsyncCallback callback);
}
