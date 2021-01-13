package com.capgemini.overriding;

public class Main {

	public static void main(String[] args) {
		// move - human: Running
		// move - birds: Flying
		// move - fish: Swim
		
		BaseClass ref = null;
		
		ref = new BaseClass();
		ref.show();
		
		ref = new SubClass();
		ref.show2();
	}

}
