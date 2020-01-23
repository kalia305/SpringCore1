package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {
	private String beanId;
    private ApplicationContext ctx=null;
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("WebContainer.setApplicationContext(-)");
		this.ctx=ctx;
	}
	
	public WebContainer(String beanId) {
		this.beanId=beanId;
	  System.out.println("WebContainer::1-param constructor");
	}
	
	public void  processRequest(String data) {
		System.out.println("WebContainer::processRequest() is processing the request with data->"+data);
		RequestHandler handler=null;
		//get Dependent bean class obj using dependency lookup
		handler=ctx.getBean(beanId,RequestHandler.class);
		//use handler
		handler.handleRequest(data);
	}

	

}
