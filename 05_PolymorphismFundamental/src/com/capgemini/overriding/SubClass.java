package com.capgemini.overriding;

public class SubClass extends BaseClass {
	@Override
	protected void show() {
		System.out.println("Showing attributes of subclass");
	}
	
	//covariant override
	 public SubClass show2() {
			System.out.println("Showing attributes of sub class");
	        return null;	
	 }
}
