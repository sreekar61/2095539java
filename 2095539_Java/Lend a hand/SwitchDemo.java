package com.cognizant;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Option:");
		int option = sc.nextInt();
		
		switch(option){
		
		case 1:
		
		System.out.println("Tamil");
		break;
		
		case 2:
			
			System.out.println("English");
			break;
			
		case 3:
			
			System.out.println("Hindi");
			break;
			
			default:
				System.out.println("Please enter correct Option......");
		}

	}

}
