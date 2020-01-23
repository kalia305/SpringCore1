package com.nt.sjc;

public class Printer {
   private  static  Printer INSTANCE;
   
   private Printer(){
	    System.out.println("Printer:: 0-param constructor");
   }
   
   public  static  Printer  getInstance() {
	      if(INSTANCE==null)
	    	  INSTANCE=new Printer();
	      return INSTANCE;
   }


}
