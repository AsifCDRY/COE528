package coe528lab1;

/**
 *
 * @author a35choud
 */
public class Ticket {
    private Passenger passenger;    
    private Flight flight;
    private double price;
    private static int number;
    
    public Ticket(Passenger passenger, Flight flight, double price){
        this.price = price;
        this.passenger = passenger;
        this.flight = flight;
    }
    
    public Passenger getPassenger(){
        return passenger;
    }
    
    public Flight getFlight(){
        return flight;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getTicketNumber(){
        return number;
    }
    
     public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
     
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void setNumber(int number) {
        Ticket.number = number;
    }
    
    @Override
    public String toString(){
        String tickString = new String();
        tickString = passenger.name + " " + flight.toString() + ", ticket price: $" + price;
        return tickString;
    }
    
}
