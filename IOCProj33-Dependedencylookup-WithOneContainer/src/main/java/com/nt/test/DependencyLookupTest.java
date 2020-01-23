package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Cricketer;
import com.nt.utility.IOCContainerUtil;

public class DependencyLookupTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Cricketer crktr=null;
		  //get IOC container
		  factory=IOCContainerUtil.getContainer();
		System.out.println("main IOC container");
		//get Target Bean class object
		crktr=factory.getBean("crktr",Cricketer.class);
		//invoke mehtods
		crktr.fielding();
		crktr.bowling();
		crktr.batting();
	}//main
}//class
