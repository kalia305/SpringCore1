package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingElgibilityCheck;

public class BeanLifeCycleTestProgramaticWithBF {

	public static void main(String[] args) {
		VotingElgibilityCheck vec=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		vec=factory.getBean("vce",VotingElgibilityCheck.class);
		//invoke b.method
		System.out.println(vec.checkUrVotingElgibility());
		
		//destroy singletons
		factory.destroySingletons();
		

	}//main
}//class
