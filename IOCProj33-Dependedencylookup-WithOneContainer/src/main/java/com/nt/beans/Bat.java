package com.nt.beans;

import java.util.Random;

public class Bat {

	 public int  scoreRuns() {
		 System.out.println("Scoring runs with Bat");
		 return  new Random().nextInt(3000);
	 }
}
