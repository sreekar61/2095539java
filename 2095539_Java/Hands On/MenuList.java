package com.cognizant.shapes;

import java.util.*;

public class MenuList {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
	      int select;
	      RandomClass.menu();
	      select = sc.nextInt();
	      switch (select)
	      {
	      case 1:
        	  System.out.println("Please enter your details");
        	  sc.nextLine();
        	  RandomClass.register();
              	  break;
              case 2:
        	  System.out.println("Welcome to room booking process");
        	  sc.nextLine();
        	  RandomClass.roomBooking();
        	  break;
              case 3:
              	  System.out.println("Fetching the data of all available rooms...");
                  sc.nextLine();
                  RandomClass.roomDetails();
                  break;
              case 4:
        	  System.out.println("Welcome to Phone NUmber updation process");
        	  sc.nextLine();
        	  RandomClass.phUpdation();
        	  break;
              case 5:
              	  System.out.println("Fetching the data of all customers...");
              	  sc.nextLine();
              	  RandomClass.allCustomers();
              	  break;
              case 6:
               	  System.out.println("Quitting Process...");
               	  sc.nextLine();
              	  RandomClass.quit();
              	  break;
              default:
              	System.out.println("Invalid Option");
              	break;
	      }
	}

}


