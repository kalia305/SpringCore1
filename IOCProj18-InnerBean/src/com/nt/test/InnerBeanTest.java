package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankAccount;
import com.nt.beans.BankCustomer;

public class InnerBeanTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		BankCustomer customer=null;
		BankAccount account=null;
		//create  IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target Bean class object
		customer=factory.getBean("rajaCustomer",BankCustomer.class);
		System.out.println("Account balance::"+customer.getBalance());
		System.out.println(customer);
		System.out.println(".................................");
		
		
		
		
	}

}
