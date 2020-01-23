package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;

	public WebContainer(String beanId) {
		this.beanId=beanId;
	  System.out.println("WebContainer::1-param constructor");
	}
	
	public void  processRequest(String data) {
		System.out.println("WebContainer::processRequest() is processing the request with data->"+data);
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		
		//create an extra IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Dependent bean class obj using dependency lookup
		handler=ctx.getBean(beanId,RequestHandler.class);
		//use handler
		handler.handleRequest(data);
	}

}
