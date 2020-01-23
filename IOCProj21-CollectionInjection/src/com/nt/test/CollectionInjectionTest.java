package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.College;
import com.nt.beans.FacultiesInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.Marks;
import com.nt.beans.PersonalInfo;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks mk=null;
		College clg=null;
		PersonalInfo per=null;
		FruitStore store=null;
		FacultiesInfo info=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println(".........................................");
		clg=factory.getBean("clg",College.class);
		System.out.println(clg);
		System.out.println("...............................");
		per=factory.getBean("perInfo",PersonalInfo.class);
		System.out.println(per);
		System.out.println("...................................");
		store=factory.getBean("fruitStore",FruitStore.class);
		System.out.println(store);
		System.out.println("...........................");
		info=factory.getBean("fInfo",FacultiesInfo.class);
		System.out.println(info);
		
		
		

	}

}
