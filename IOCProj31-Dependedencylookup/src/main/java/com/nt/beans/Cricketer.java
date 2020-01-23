package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Cricketer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		System.out.println("setBeanId(-)");
		this.beanId = beanId;
	}

	public void batting() {
		System.out.println("batting  method");
		BeanFactory factory=null;
		Bat bat=null;
		int runs=0;
		//create IOC container for dependency lookup
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		System.out.println("second IOC container");
		//perform dependency lookup
		bat=factory.getBean(beanId,Bat.class);
		//invoke methods
		runs=bat.scoreRuns();
		
		System.out.println("Cricketer is batting with the score::"+runs);
	}
	
	public void bowling() {
		System.out.println("Cricketer is bolwing");
	}
	
	public   void fielding() {
		System.out.println("Cricketer is fielding");
	}

}
