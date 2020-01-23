package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Cricketer crktr=null;
		  //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		System.out.println("main IOC container");
		//get Target Bean class object
		crktr=factory.getBean("crktr",Cricketer.class);
		//invoke mehtods
		crktr.fielding();
		crktr.bowling();
		crktr.batting(factory);
	}//main
}//class
