package BookingSystem;

import java.time.LocalDate;
import java.time.Period;

import BookingSystem.GuestHouseBooking.GuestHousebooking;
public class BookARoom implements GuestHousebooking  {
	   int totalFare;
	   String roomChoice;
	   String wantAdditionalFacilities;
	   String checkStatus="Vacant";
	   String dateOfArrival;
	   String dateOfDeparture;
	   int AdditionalFacilities=250;
	   String wanttoProceed;
	   String updateEmailId;
	   Period Difference;
	   int personBookedRoom;
	
	   
       public int roomSelection()
       {
    	   
    	   if(roomChoice.equals("AC") && wantAdditionalFacilities.equals("Yes"))
    	   {
    		   totalFare=Difference.getDays()*(1000)+AdditionalFacilities;
    		   System.out.println("Additional facilites includes wifi,Cable-Connection,LanudaryServices");
    		   return totalFare;
    	   }
    	   else if(roomChoice.equals("AC") && wantAdditionalFacilities.equals("No"))
    	   {
    		   totalFare=Difference.getDays()*1000;
    		   return totalFare;
    	   }
    	   else if(roomChoice.equals("NON-AC") && wantAdditionalFacilities.equals("Yes"))
    	   {
    		   totalFare=Difference.getDays()*(750)+AdditionalFacilities;
    		   System.out.println("Additional facilites includes wifi,Cable-Connection,LanudaryServices");
    		   return totalFare;
    	   }
    	   else
    	   {
    		   totalFare=750;
    		   return totalFare;
    	   }
    	}
       public void roomAvalibility()
       {
    	   if(checkStatus=="Vacant")
    	   {
    		   roomSelection();
    	   }
    	   else
    	   {
    		  System.out.println("Sorry! Rooms are Occupied");
    		  System.exit(0);
    	   }
       }
       public void checkInputDate()
       {
    	   LocalDate arrivaldate =LocalDate.parse(dateOfArrival);
    	   LocalDate departureDate=LocalDate.parse(dateOfDeparture);//Session_2_Class_and_object_methods_Access_Specifiers_Integrated_HandsOn
    	   LocalDate currentDate=LocalDate.now();
    	   Difference =Period.between(arrivaldate,departureDate);
    	   if(arrivaldate.isAfter(currentDate) && departureDate.isAfter(arrivaldate))
    	   {
    		   
    		   System.out.println("Proceed for booking");
    	   }
    	   else
    	   {
    		   System.out.println("Please Enter correct date!!");
    		   
    	   }
    	   
    	   
       }
       public String toString()
       {
    	   return "BookingDetails[roomChoice="+roomChoice+", TotalFare="+totalFare+",WantadditionalFacilities="+wantAdditionalFacilities+",BookingDate="+dateOfArrival+",LeavingDate="+dateOfDeparture+",TotalNoOfDays="+Difference.getDays()+",Totalpersonbookedroom="+personBookedRoom+"]";
       }
       public void selection()
       {
    	  if(wanttoProceed.equals("Yes"))
    	  {
    		  System.out.println("Enter our Room Booking choice AC or NON-AC:-");
    	  }
    	  else
    	  {
    		  System.exit(0);
    	  }
       }
	
	
       
       
       
       
}

