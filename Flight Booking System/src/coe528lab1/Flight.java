package coe528lab1;

/**
 *
 * @author a35choud
 */
public class Flight {
    private int flightNumber, capacity, numberOfSeatsLeft;
    private String origin, destination, departureTime;
    private double originalPrice;
    
    public Flight(int flightNumber, int capacity, String origin, String destination, String departureTime, double originalPrice){
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.origin = origin;
        
        if(origin.equals(destination)){
            throw new IllegalArgumentException("The origin and the destination cannot be the same");
        }
        else
            this.destination = destination;
        
        this.departureTime = departureTime;
        this.originalPrice = originalPrice;
        numberOfSeatsLeft = capacity;
    }
    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public double getOriginalPrice(){
        return this.originalPrice;
    }
    
    public void setFlightNumber(int f){
        if(f <= 0)
            throw new IllegalArgumentException("The flight number cannot be zero or negative");
        else
            flightNumber = f;
    }
    
    public void setCapacity(int c){
        if(c < 0)
            throw new IllegalArgumentException("The capacity cannot be set to a negative number");
        else
            capacity = c;
    }
    
    public void setNumberOfSeatsLeft(int n){
        if(n < 0)
            throw new IllegalArgumentException("The number of seats left cannot be set to a negative number");
        else
            numberOfSeatsLeft = n;
    }
    
    public void setOrigin(String o){
        origin = o;
    }
    
    public void setDestination(String d){
        destination = d;
    }
    
    public void setDepartureTime(String de){
        departureTime = de;
    }
    
    public void setOriginalPrice(double o){
        originalPrice = o;
    }
    
    public boolean bookASeat(){
        if(numberOfSeatsLeft > 0){
            --numberOfSeatsLeft;
            return true;
        }
        else
            return false;
    }
    
    @Override
    public String toString(){
        String flightStr;
        
        flightStr = "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + 
                ", original price: $" + originalPrice;
        
        return flightStr;
    }
}
