package com.nt.basics;

public class Test {
	  private int x,y;
	private Test() {
		System.out.println("Test:: 0-param constructor");
	}
	
	private Test(int x,int y) {
		System.out.println("Test:: 2-param constructor");
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

		
	

}
