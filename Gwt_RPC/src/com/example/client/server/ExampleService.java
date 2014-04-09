package com.example.client.server;

import com.example.client.gui.Person;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("exampleservice")
public interface ExampleService extends RemoteService {
	Person getPerson(String name, String surname, int password);
	String sayHello(String name);
}
