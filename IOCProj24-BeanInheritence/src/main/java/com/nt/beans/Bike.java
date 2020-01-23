package com.nt.beans;

public class Bike {
	private String regNo;
	private String owner;
	private  String model;
	private String company;
	private String color;
	private int engineCC;
	private int fuelTankCapacity;
	private long  engineNo;
	
	public Bike() {
		System.out.println("Bike:: Bike");
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setFuelTankCapacity(int fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}

	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", owner=" + owner + ", model=" + model + ", company=" + company + ", color="
				+ color + ", engineCC=" + engineCC + ", fuelTankCapacity=" + fuelTankCapacity + ", engineNo=" + engineNo
				+ "]";
	}
	
	

}
