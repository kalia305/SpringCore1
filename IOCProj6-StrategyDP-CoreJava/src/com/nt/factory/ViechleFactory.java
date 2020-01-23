package com.nt.factory;

import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Viechle;
import com.nt.comp.WaterEngine;
//Factory class
public class ViechleFactory {
	
	public static  Viechle getInstance(String engineType) {
		  Engine engg=null;
		  Viechle viechle=null;
		//create Dependent class obj
		  if(engineType.equalsIgnoreCase("diesel"))
			engg=new DieselEngine();
		else if(engineType.equalsIgnoreCase("petrol"))
			engg=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("water"))
			engg=new WaterEngine();
		else
			throw new IllegalArgumentException("Invalid  engine Type");
		//create Target class object 
		viechle=new Viechle();
		viechle.setEngine(engg);
		return viechle;
	}

}
