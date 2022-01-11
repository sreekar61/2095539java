package BookingSystem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
	    BookARoom bar=new BookARoom();
	    
		
		Scanner sc=new Scanner(System.in);
		System.out.println("No.of person u want to book the  room:-");
		int n=sc.nextInt();
		customerRegistration Cr[]=new customerRegistration[n];//Making arrays of object for class customer registration
		for(int i=0;i<Cr.length;i++)
		{
			System.out.println("Enter Details for "+(i+1)+" "+"customer");
			Cr[i]=new customerRegistration();
			System.out.println("Enter customer Name:-");
			Cr[i].setCustomerName(sc.next());
			System.out.println("Enter customer Id:-");
			Cr[i].setCustomerId(sc.next());
			System.out.println("Enter customer Address:-");
			Cr[i].setAddress(sc.next());
			System.out.println("Enter customer setPhoneNo :-");
			Cr[i].setPhoneNo(sc.nextLong());
			System.out.println("Enter customer EmailId:-");
			Cr[i].setEmailId(sc.next());
			
		}
		for(customerRegistration re:Cr)
		{
			System.out.println(re.toString());
		}
		bar.personBookedRoom=Cr.length;
		System.out.println("No. of  person you want to book the room="+" "+bar.personBookedRoom);
		System.out.println("Enter Arrival Date on Room in YYYY-MM-DD format:-");
		bar.dateOfArrival=sc.next();
		System.out.println("Enter Departure Date from Room in  YYYY-MM-DD format:-:-");
		bar.dateOfDeparture=sc.next();
		bar.checkInputDate();
		System.out.println("U want to proceed Further for Booking:-Yes or No??");
		bar.wanttoProceed=sc.next();
		bar.selection();
		bar.roomChoice=sc.next();
		System.out.println("Do you Want Additional Facilities ?:- Yes or No");
		bar.wantAdditionalFacilities=sc.next();
		bar.roomAvalibility();
		System.out.println("The total fare is "+bar.roomSelection());
		System.out.println("Checking for room Avalability...Please Wait");
		System.out.println("Yes rooms are Available.Your booking is done.Your booking details will be sent to the registerd emailId "+Cr[0].getEmailId());
		System.out.println("Want to change emailId:-Yes or No??");
		bar.updateEmailId=sc.next();
		if(bar.updateEmailId.equals("Yes"))
		{
			System.out.println("Enter new Email Address:-");
			Cr[0].setEmailId(sc.next());
		}
		
		System.out.println("Your Booking is confirmed");
		System.out.println("Details of Booking:-");
		System.out.println(bar.toString());
		Map<String,BookARoom> bookingDetails=new HashMap<String,BookARoom>();
		bookingDetails.put(Cr[0].getCustomerId(), bar);
		System.out.println("bookingDetails>>>"+bookingDetails);
		sc.close();
			
		

	}

}


