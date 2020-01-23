package com.nt.editor;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrestAmountDetails;

public class IntrestAmountDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=0.0f, rate=0.0f, time=0.0f;
		IntrestAmountDetails  details=null;
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));
		time=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		rate=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		System.out.println(pAmt+"  "+time+"  "+rate);
		//create IntrestAmountDetails class object
		details=new IntrestAmountDetails();
		details.setPamt(pAmt);
		details.setTime(time);
		details.setRate(rate);
		//set to Bean Property
		setValue(details);
	
	}

}
