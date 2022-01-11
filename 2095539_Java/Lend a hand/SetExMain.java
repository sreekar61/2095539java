package com.cognizant;

import java.util.Set;

public class SetExMain {

	public static void main(String[] args) {
		SetEx ex1 = new SetEx();
		System.out.println(ex1.getCountries("India", 
	"Australia","Africa","England","New Zealand"));
		Set<Integer> num1To10 = ex1.get1to10();
		System.out.println(num1To10);
		System.out.println(ex1.get11To15(num1To10));

	}

}
