package com.example.client.server;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceClientInt {

	void getPerson(String name,String surname,int password);
	void sayHello(String name);
 
}
