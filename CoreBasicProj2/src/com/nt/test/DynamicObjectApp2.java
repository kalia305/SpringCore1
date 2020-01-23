package com.nt.test;

import java.lang.reflect.Constructor;

public class DynamicObjectApp2 {

	public static void main(String[] args) {
		Class c1=null,c2=null;
		Constructor cons[]=null,cons1[]=null;
		Object obj1=null,obj2=null,obj3=null;
		
		try {
			//load class 
			c1=Class.forName(args[0]);
			//get Constructors  of the loaded class
			cons=c1.getDeclaredConstructors();
			cons[0].setAccessible(true);
			cons[1].setAccessible(true);
			//create object of loaded class using parameterized constructor
			obj1=cons[1].newInstance(10,20);
			System.out.println("Test(2-param)--->"+obj1.toString());
			//create object of loaded class using 0-param constructor
			obj2=cons[0].newInstance();
			System.out.println("Test(0-param)--->"+obj2.toString());
			//Load  java.util.DAte class
			c2=Class.forName(args[1]);
			//get constructors of Loaded java.util.Date class...
			cons1=c2.getDeclaredConstructors();
			//create obj of loaded Date class using 3 -param constructor
			obj3=cons1[5].newInstance(2010-1900,9,23);
			System.out.println("Date(3param)--->"+obj3.toString());
		}
		catch(InstantiationException iae) {
			iae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
