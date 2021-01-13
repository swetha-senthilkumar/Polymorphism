package com.capgemini.abstractkeyword;

import static java.lang.Math.random;
public class Main {

	public static void main(String[] args) {
		//cant instantiate account
		//Account ac = new Account();
	    
		Account ac = null;
	    
		if(random() > 0.5) {
			ac = new Saving(1001,"swetha",7000000, 4.5);
		}else {
			ac = new Current(1002,"Capgemini ltd", 500000, 500000);
		}
		
		ac.showAccount();
		
	}

}
