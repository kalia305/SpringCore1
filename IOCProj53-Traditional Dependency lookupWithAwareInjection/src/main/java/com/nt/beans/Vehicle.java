package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle implements ApplicationContextAware{
	private  String beanId;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Vehicle.setApplicationContext(-)");
	   this.ctx=ctx;
		
	}

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
		Engine engg=null;
		//get Dependent Bean class object (through Lookup)
		engg=ctx.getBean(beanId,Engine.class);
		engg.start();
		System.out.println("Jounery started from the Place"+startPlace);
		System.out.println("Jounery is going on......");
		engg.stop();
		System.out.println("Jounery ended at the Place"+destPlace);
	}



}
