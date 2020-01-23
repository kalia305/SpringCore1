package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;
.
public class SetterInjectionTest1 {

	public static void main(String[] args) {
		BeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessageGenerator generator=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Xml reader
		reader=new XmlBeanDefinitionReader(factory);
		//Load xml file
		//reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml","com/nt/cfgs/applicationContext1.xml");
		//get Bean
		generator=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println("Wish Message::"+generator.generateMessage("raja"));
		
		  
	}//main
}//class
