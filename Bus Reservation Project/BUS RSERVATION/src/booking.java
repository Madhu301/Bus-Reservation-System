import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class booking {
    Scanner in=new Scanner(System.in);

    String passengerName;
    int busno; 
    Date date;
    int seats;
    
    //constructor
    booking() throws ParseException{

        //Booking Name
        System.out.println("Enter your name: ");
        passengerName=in.nextLine();

        // Bus no
        System.out.println("Enter Bus No: ");
        busno=in.nextInt();

        // DATE
        System.out.println("Enter Date as dd-mm-yyyy: ");
        String dateInput=in.next();
            // changing the date in string format to real date using SimpleDateFormat class
        SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
        date=d.parse(dateInput);

        //Seats
        System.out.println("No of seats: ");
        seats=in.nextInt();    
        
        
        

        
             
    }


    public void checkAvailability(ArrayList<bus> buses)
    {
        for(bus i:buses)
        {
            if(i.getBusno()==busno)
                {
                    if(seats<=i.getcapacity())
                    {
                        System.out.println("\nBooking is done");
                        displaydetails(i,passengerName,seats);
                        i.capacity=i.capacity-seats;
                    } 
                    else
                    {                  
                        System.out.printf("Seats available =%d\n",i.capacity);
                        System.out.println("Adequate seats not available. Change date or bus");
                    }
                    
                }
        }

        
        

       
    }
    public void displaydetails(bus b,String name,int seats)
        {
            System.out.println("\nDETAILS");
            System.out.println("Booking Name: "+name);
            System.out.println("Bus no: "+b.getBusno());
            System.out.println("From: "+b.getfrom()+" To: "+b.getTo());
            System.out.println("No of seats: "+seats);
            

        }
        


    

    

    
}
