import java.util.*;
import java.util.ArrayList;
import java.text.ParseException;


public class App {
    public static void main(String[] args) throws ParseException {
       Scanner in=new Scanner(System.in);
       
       // bus objects
       ArrayList<bus> buses=new ArrayList<bus>();
       
       buses.add(new bus(1,30,true,"CHENNAI","ERODE"));
       buses.add(new bus(2,20,false,"ERODE","COIMBATORE"));
       buses.add(new bus(3,50,false,"CHENNAI","MADURAI"));
       buses.add(new bus(4,20,false,"MADURAI","CHENNAI"));
       buses.add(new bus(5,50,false,"COIMBATORE","SALEM"));
       buses.add(new bus(6,30,false,"CHENNAI","COIMBATORE"));

       //booking objects
       ArrayList<booking> passengers=new ArrayList<booking>();


       // to start booking
       int enter;
       do
       {
            System.out.println("Enter 1 to book , 2 to exit : ");
            enter=in.nextInt();
            if(enter==1)
            {
                System.out.println("BusNo From      To");
                for(bus b:buses)
                {
                    System.out.println(b.getBusno()+"     "+b.getfrom()+"   "+b.getTo());
                }
                // collect details of a customer
                booking book=new booking();
           
                //check if booking is available
                book.checkAvailability(buses);
                
               
            }
            else
            {
                System.out.println("Thank you");
            }

                   

        }while(enter==1);

       
        
    }

    

   
}
