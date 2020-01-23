package com.nt.test;

import javax.swing.text.ViewFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comp.Viechle;

public class StrategyDPTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Viechle viechle=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target class objet
		viechle=factory.getBean("viechle",Viechle.class);
		//invoke method
		viechle.journey("hyd","goa");
	}

}
