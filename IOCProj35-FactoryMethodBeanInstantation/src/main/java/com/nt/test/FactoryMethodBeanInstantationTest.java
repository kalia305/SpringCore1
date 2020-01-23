package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInstantationTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Calendar cal=null;
		Properties props=null;
		Class clazz=null;
		String str1=null,str2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean1
		cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal);
		System.out.println("...............................");
		props=factory.getBean("props",Properties.class);
		System.out.println(props);
		System.out.println("........................");
		clazz=factory.getBean("clazz",Class.class);
		System.out.println("class name::"+clazz.getClass()+" data"+clazz);
		System.out.println(".............................");
        str1=factory.getBean("s2",String.class);
        System.out.println(str1);
        System.out.println("................................");
        str2=factory.getBean("s3",String.class);
        System.out.println("class name::"+str2.getClass()+"  data::"+str2);
        
	}

}
