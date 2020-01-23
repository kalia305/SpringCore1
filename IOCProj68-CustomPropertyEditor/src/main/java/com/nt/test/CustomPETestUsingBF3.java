package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.IntrestAmountCalculator;
import com.nt.beans.IntrestAmountDetails;
import com.nt.editor.IntrestAmountDetailsEditor;

public class CustomPETestUsingBF3 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		IntrestAmountCalculator iac=null;
		CustomEditorConfigurer cec=null;
		//create IOC container
		factory=new DefaultListableBeanFactory(); 
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get Access to CustomEditorConfigurer object
		cec=factory.getBean("cec",CustomEditorConfigurer.class);
		//register with container
		cec.postProcessBeanFactory(factory);
		
	
		
		//get Target Bean class object
		iac=factory.getBean("iac",IntrestAmountCalculator.class);
		//invoke the method
		System.out.println("Intrest amount is ::"+iac.generateIntrestAmount());

	}//main method
	
	
}//outer class
