package com.nt.beans;

public class IntrestAmountCalculator {
	private  IntrestAmountDetails details;

	public IntrestAmountCalculator(IntrestAmountDetails details) {
		this.details = details;
	}
	
	
	public float  generateIntrestAmount() {
		return (details.getPamt()*details.getRate()*details.getTime())/100.0f;
	}
	

}
