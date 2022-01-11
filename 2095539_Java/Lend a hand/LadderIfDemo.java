package com.cognizant;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int  a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b && a>c){
			System.out.println("a is big");
		}
		
		else if (b>c){
			System.out.println("b is big");
		}
		
		else {
		System.out.println("c is big");
		}
		

	}

}
