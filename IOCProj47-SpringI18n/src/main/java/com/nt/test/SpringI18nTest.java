package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null;
		String msg1=null,msg2=null,msg3=null,msg4=null,msg5=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// prepare Locale object
		locale=new Locale(args[0],args[1]);
		// get Messages
		msg1=ctx.getMessage("btn.cap1",new Object[] {"employee"},"msg1",locale);
		msg2=ctx.getMessage("btn.cap2",new Object[] {},"msg2",locale);
		msg3=ctx.getMessage("btn.cap3",new Object[] {},"msg3",locale);
		msg4=ctx.getMessage("btn.cap4",new Object[] {},"msg4",locale);
		msg5=ctx.getMessage("btn.cap1",new Object[] {},"msg5",new Locale("de","DE"));
		System.out.println(msg5);
		//create  JFrame
		 frame=new JFrame();
		 //create Buttons
		 btn1=new JButton(msg1);
		 btn2=new JButton(msg2);
		 btn3=new JButton(msg3);
		 btn4=new JButton(msg4);
		 frame.add(btn1); frame.add(btn2); frame.add(btn3);
		 frame.add(btn4);
		 //set Layout
		 frame.setLayout(new FlowLayout());
		 //set size
		 frame.pack();
		 //set visibility
		 frame.setVisible(true);
		 
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}

}
