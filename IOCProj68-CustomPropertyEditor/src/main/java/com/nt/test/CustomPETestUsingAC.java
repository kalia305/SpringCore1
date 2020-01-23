package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrestAmountCalculator;
import com.nt.beans.IntrestAmountDetails;
import com.nt.editor.IntrestAmountDetailsEditor;

public class CustomPETestUsingAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator iac=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target Bean class object
		iac=ctx.getBean("iac",IntrestAmountCalculator.class);
		//invoke the method
		System.out.println("Intrest amount is ::"+iac.generateIntrestAmount());

	}//main method

}//outer class
