package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class PersonalInfo {
	private long ano;
	private String name;
	private  Date  dob;
	private  float age;
	private char gender;
	private  File  photoPath;
	private  String[] verifiers;
	private  URL  fbProfileUrl;
	private  Currency  currencySymbol;
	private  byte[]  luckyNumbers;
	private Class  favoriteJavaClass;
	private TimeZone  timezone;
	private  Locale  currentLocale;
	public void setAno(long ano) {
		this.ano = ano;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public void setFbProfileUrl(URL fbProfileUrl) {
		this.fbProfileUrl = fbProfileUrl;
	}
	public void setCurrencySymbol(Currency currencySymbol) {
		this.currencySymbol = currencySymbol;
	}
	public void setLuckyNumbers(byte[] luckyNumbers) {
		this.luckyNumbers = luckyNumbers;
	}
	public void setFavoriteJavaClass(Class favoriteJavaClass) {
		this.favoriteJavaClass = favoriteJavaClass;
	}
	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}
	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}
	
	@Override
	public String toString() {
		return "PersonalInfo [ano=" + ano + ", name=" + name + ", dob=" + dob + ", age=" + age + ", gender=" + gender
				+ ", photoPath=" + photoPath + ", verifiers=" + Arrays.toString(verifiers) + ", fbProfileUrl="
				+ fbProfileUrl + ", currencySymbol=" + currencySymbol.getSymbol() + ", luckyNumbers=" + Arrays.toString(luckyNumbers)
				+ ", favoriteJavaClass=" + favoriteJavaClass + ", timezone=" + timezone + ", currentLocale="
				+ currentLocale + "]";
	}
	
	
	

}
