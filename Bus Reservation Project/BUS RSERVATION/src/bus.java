
public class bus{

    int busno;
    int capacity;
    boolean ac;
    String from;
    String to;

    bus(int busno,int capacity,boolean ac,String from,String To)
    {
        this.busno=busno;
        this.capacity=capacity;
        this.ac=ac;
        this.from=from;
        this.to=To;
    }

    public int getBusno() {
        return busno;
    }

    public int getcapacity()
    {
        return capacity;
    }

    public String getfrom()
    {
        return from;
    }

    public String getTo()
    {
    return to;
    }

   
   
    
}