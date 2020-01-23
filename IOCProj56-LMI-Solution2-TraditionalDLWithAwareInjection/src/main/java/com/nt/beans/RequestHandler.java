package com.nt.beans;

public class RequestHandler {
	private static int count=0;
	
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:: 0-param constructor ::::"+count);
	}
	
	public   void  handleRequest(String data) {
		System.out.println("RequestHandler.handleRequest() ::  Handling request with data->"+data);
	}

}
