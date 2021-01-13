package com.capgemini.overriding;

import static java.lang.Math.random;
public class Main2 {
	public static void main(String[] args) {
		BaseClass ref = null;
		
		//double randomNumber = Math.random();
		double randomNumber = random();
		if(randomNumber > 0.5) {
			ref = new BaseClass();
		}else {
			ref = new SubClass();
		}
		// binding hpns only during run time
		//polymorphically calling method
		ref.show();
	}

}
