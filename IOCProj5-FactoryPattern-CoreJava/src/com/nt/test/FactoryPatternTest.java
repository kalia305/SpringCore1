package com.nt.test;

import com.nt.car.SuzukiCar;
import com.nt.factory.SuzukiCarFactory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		SuzukiCar car=null;
		car=SuzukiCarFactory.getInstance("baleno","mrf");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		System.out.println("................................");
		car=SuzukiCarFactory.getInstance("ciaz","ceat");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		
		
	}

}
