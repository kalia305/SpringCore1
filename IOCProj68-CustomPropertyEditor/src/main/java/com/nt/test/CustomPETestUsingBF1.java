package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.IntrestAmountCalculator;
import com.nt.beans.IntrestAmountDetails;
import com.nt.editor.IntrestAmountDetailsEditor;

public class CustomPETestUsingBF1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		IntrestAmountCalculator iac=null;
		//create IOC container
		factory=new DefaultListableBeanFactory(); 
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//add CustomPERegistrar to IOC container
		factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(IntrestAmountDetails.class,
						                                             new IntrestAmountDetailsEditor());
			}
		});
		
		//get Target Bean class object
		iac=factory.getBean("iac",IntrestAmountCalculator.class);
		//invoke the method
		System.out.println("Intrest amount is ::"+iac.generateIntrestAmount());

	}//main method
	
	
}//outer class
