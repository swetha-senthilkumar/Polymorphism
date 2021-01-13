package com.capgemini.interfaceusages;

interface X1{
	//implicitly it is a abstract method
	//int x= 10;
	//void show();
	
	public static final int x = 10;
	public abstract void showX();
}

class C1 implements X1{
	
	@Override
	public void showX() {
		System.out.println("Showing value of X = "+X1.x);
	}
}

public class Main {
	public static void main(String[] args) {
		X1 obj = new C1();
		
		obj.showX();
	}
}
