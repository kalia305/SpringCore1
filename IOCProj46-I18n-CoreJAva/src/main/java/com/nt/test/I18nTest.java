package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18nTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		String cap1=null,cap2=null,cap3=null,cap4=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		JFrame frame=null;
		//create Locale obj
		locale=new Locale(args[0],args[1]);
		//create ResourceBundle object
		bundle=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//get the Labels
		cap1=bundle.getString("btn.cap1");
		cap2=bundle.getString("btn.cap2");
		cap3=bundle.getString("btn.cap3");
		cap4=bundle.getString("btn.cap4");
		//add Buttons with Captions
		frame=new JFrame();
		btn1=new JButton(cap1);
		btn2=new JButton(cap2);
		btn3=new JButton(cap3);
		btn4=new JButton(cap4);
		frame.add(btn1); frame.add(btn2);
		frame.add(btn3); frame.add(btn4);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);
	}
}
