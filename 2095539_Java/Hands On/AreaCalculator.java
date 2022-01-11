package com.cognizant.shapes;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		rectangle.length = scanner.nextInt();
		rectangle.breadth = scanner.nextInt();
		rectangle.calculateArea();
       

	}

}
