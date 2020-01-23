package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMIProblemTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container=null,container1=null;
		//create IOC contaner
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target bean class object
		container=ctx.getBean("container",WebContainer.class);
		//invoke methods
		container.processRequest("hello");
		System.out.println("--------------------------------");
		container1=ctx.getBean("container",WebContainer.class);
		container1.processRequest("hai");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
