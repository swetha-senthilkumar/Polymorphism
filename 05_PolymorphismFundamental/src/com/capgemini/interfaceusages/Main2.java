package com.capgemini.interfaceusages;

interface X2{
	//implicitly it is a abstract method
	//int x= 10;
	//void show();
	
	public static final int x = 10;
	public abstract void showX();
}

interface Y2{
	void showY() ;
}

class C2 implements X2, Y2{
	
	@Override
	public void showX() {
		System.out.println("Showing value of X = "+X2.x);
	}

	@Override
	public void showY() {
		System.out.println("Showing value of y");		
	}
}

public class Main2 {
	public static void main(String[] args) {
		X2 obj = new C2();
		
		obj.showX();
		
		Y2 obj2 = new C2();
		obj2.showY();
	}
}

