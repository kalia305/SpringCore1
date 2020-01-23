package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
	private  String beanId;

	public Vehicle(String beanId) {
		System.out.println("Vehicle:: 1-param constructor");
		this.beanId = beanId;
	}
	
	public void  entertaiment() {
		System.out.println("Vehicle:: entertainment with  DVD Player");
	}
	
	public void soundHorn() {
		System.out.println("Vehicle:: SoundHorn with Skoda Horn");
	}
	
	public  void journey(String startPlace,String destPlace) {
		ApplicationContext ctx=null;
		Engine engg=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Dependent Bean class object (through Lookup)
		engg=ctx.getBean(beanId,Engine.class);
		engg.start();
		System.out.println("Jounery started from the Place"+startPlace);
		System.out.println("Jounery is going on......");
		engg.stop();
		System.out.println("Jounery ended at the Place"+destPlace);
	}

}
