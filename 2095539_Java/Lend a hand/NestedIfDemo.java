package com.cognizant;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = scanner.nextInt();
		
		if(age>=18){
			System.out.println("Eligible for vote...");
			System.out.println("Enter your Gender : 1.Male  2.Female");
		int gender= scanner.nextInt();
		if(gender==1) {
		
			System.out.println("Your Voting Time between 2 to 5 pm");
			
		}else {
			System.out.println("Your Voting Time between 9 to 1 pm");
		}
		
		}else{
			System.out.println("Not Eligible..");
		}
		

	}
}
