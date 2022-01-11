package com.cognizant.shapes;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class RandomClass {
	static Scanner sc = new Scanner(System.in);
		static List<String>companyName = new ArrayList<String>();
		static List<String>employeeName = new ArrayList<String>();
		static List<Integer>employeeID = new ArrayList<Integer>();
		static List<Long>phoneNumber = new ArrayList<Long>();
		static List<String>eMailID = new ArrayList<String>();
		// static Date date =new Date();
		static String date=sc.next();
		// static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		//	static Date tDate=formatter.parse(date);
		static int maxroom = 100;
		static int regcount = 0;
		static int roomcount = 0;
		static void menu()
		{
		      System.out.println(" Welcome");
		      System.out.println("1. Registeration Process - To make a new registration");
		      System.out.println("2. Room Details - Book a room, check room status and availabilities");
		      System.out.println("3. All booking details of the rooms in the hotel");
		      System.out.println("4. Email change or updation");
		      System.out.println("5. All Customers");
		      System.out.println("6. Quit");
		      System.out.println("Select an option");
		}
		
		static void register()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your Company name : ");
			companyName.add(sc.nextLine());
			System.out.println("Please enter your name : ");
			employeeName.add(sc.nextLine());
			System.out.println("Please enter your Employee ID : ");
			employeeID.add(sc.nextInt());
			System.out.println("Please enter your Phone number : ");
			phoneNumber.add(sc.nextLong());
			System.out.println("Please enter your E-mail ID : ");
			eMailID.add(sc.next());
			
			sc.nextLine();
			System.out.println(companyName.toString());
			System.out.println(employeeName.toString());
			System.out.println(employeeID.toString());
			System.out.println(phoneNumber.toString());
			System.out.println(eMailID.toString());
			System.out.println("Date "+date);
		
			regcount++;
			
			sc.nextLine();
			System.out.println("Please select an option");
			System.out.println("0. I want to register a new person");
			System.out.println("1. Quit");
			int reg = sc.nextInt();
			if(reg == 0)
			{
				register();
			}
			else 
			{
				System.out.println("Thankyou");
			}
			sc.nextLine();
			System.out.println("Please select an option");
			System.out.println("0. I would like to book a room");
			System.out.println("1. I would like to open menu");
			System.out.println("2. Quit");
			int check = sc.nextInt();
			if(check == 0)
			{
				roomBooking();
			}
			else if(check == 1)
			{
				MenuList.main(null);
			}
			else
			{
				System.out.println("Thankyou");
			}
		}
		
		static void roomBooking()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue Booking");
			System.out.println("1. Menu");
			int x = sc.nextInt();
			if(x == 0)
			{
				int n;
				System.out.println("Please enter the number of rooms");
				n = sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					System.out.println("You are allocated with the room number : "+ i);
					roomcount++;
				}
				System.out.println("Thankyou, your booking is been confirmed");
				System.out.println("Vacant rooms count : " + (maxroom-roomcount));
				quit();
			}
			else 
			{
				MenuList.main(null);
			}
		}
		static void roomDetails()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue checking the room details");
			System.out.println("1. Menu");
			int y = sc.nextInt();
			if(y == 0)
			{
				for(int i=1;i<=roomcount;i++)
				{
					System.out.println("Room number " + i + " Occupied");
				}
				System.out.println("Vacant rooms count : " + (maxroom-roomcount));
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}	
		static void phUpdation()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue with Phone Number updation");
			System.out.println("1. Menu");
			int z = sc.nextInt();
			if(z == 0)
			{
				register();
				System.out.println("Please enter your new mobile number : ");
				int index = phoneNumber.indexOf(phoneNumber.add(sc.nextLong()));
				System.out.println("Your company name : " + companyName.toString());
				System.out.println("Your name : " + employeeName.toString());
				System.out.println("Your Employee ID : " + employeeID.toString());
				System.out.println("Your old and upadted mobile number : " + phoneNumber.toString());
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}
		static void allCustomers()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue to fetch the details of all customers");
			System.out.println("1. Menu");
			int a = sc.nextInt();
			if(a == 0)
			{
				register();
				System.out.println("Your company name : " + companyName.toString());
				System.out.println("Your name : " + employeeName.toString());
				System.out.println("Your Employee ID : " + employeeID.toString());
				System.out.println("Your mobile number : " + phoneNumber.toString());
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}
		static void quit()
		 {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue with Quitting Process");
			System.out.println("1. Menu");
			int b = sc.nextInt();
			if(b == 0)
			{
				System.out.println(" Thankyou for using our application");
		    	System.out.println(" HAVE A GOOD DAY ! ");
			}
			else
			{
				MenuList.main(null);
			}
		}

}




