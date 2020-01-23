package com.nt.test;

import com.nt.comp.Viechle;
import com.nt.factory.ViechleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Viechle viechle=null;
		//get Viechle class obj
		viechle=ViechleFactory.getInstance("diesel");
		//invoke the method
		viechle.journey("hyd", "goa");
		

	}

}
