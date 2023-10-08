package coe528lab1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a35choud
 */
public class Manager {
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private static int tickCount = 0;
    
    public void createFlights(){
        Scanner userInput = new Scanner(System.in);
        int flightNum, capacity;
        double price;
        String answer, ori, dest, dep, date, time;
        
        System.out.println("Would you like to create a flight? Enter Y or N");
        answer = userInput.nextLine();
        
        if(answer.equals("Y") || answer.equals("y")){
            while(true)
            {
                System.out.println("Please enter the flight number.");
                flightNum = userInput.nextInt();
                System.out.println("Please enter the origin.");
                ori = userInput.next();
                System.out.println("Please enter the destination.");
                dest = userInput.next();
                System.out.println("Please enter the capacity.");
                capacity = userInput.nextInt();
                System.out.println("Please enter the price.");
                price = userInput.nextDouble();
                System.out.println("Please enter the departure date.");
                date = userInput.next();
                System.out.println("Please enter the departure time.");
                time = userInput.next();
                dep = date + " " + time;
                System.out.println("Would you like to create another flight? Enter Y or N");
                answer = userInput.next();                
                flights.add(new Flight(flightNum, capacity, ori, dest, dep, price));
                
                if(answer.equals("N") || answer.equals("n"))
                    break;
                else
                    continue;
            }
        }
    }
    
    public void displayAvailableFlights(String origin, String destination){
        int i = 0;
        for(Flight f : flights){
            i++;
            if(f.getOrigin().equals(origin) && f.getDestination().equals(destination) && f.getNumberOfSeatsLeft() > 0){
                System.out.println("There are " + f.getNumberOfSeatsLeft() + " seats left for flight " + f.getFlightNumber() + ", " + 
                        origin + " to " + destination);
                break;
            }
            else if(i == flights.size() && !f.getOrigin().equals(origin) && !f.getDestination().equals(destination) || f.getNumberOfSeatsLeft() <= 0)
                System.out.println("There are no flights available from " + origin + " to " + destination);
        }
    }
    
    public Flight getFlight(int flightNumber){
        for(Flight f : flights){
            if(f.getFlightNumber() == flightNumber)
                return f;
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p){
        Flight f = getFlight(flightNumber);
        Ticket t;
        if(f != null && f.getNumberOfSeatsLeft() > 0){
            f.bookASeat();
            tickets.add(new Ticket(p, f, f.getOriginalPrice()));
            t = tickets.get(tickCount);
            t.setPrice(p.applyDiscount(f.getOriginalPrice()));
            System.out.println(t.toString());
            tickCount++;
        }
        else
            System.out.println("Cannot book this flight for " + p.name);
    } 

    public static void main(String[] args){
        Manager m = new Manager();
        Passenger p1 = new Member("Robert Pattinson", 36, 6);
        Passenger p2 = new NonMember("Christian Bale", 48);
        Passenger p3 = new Member("Ryan Reynolds", 46, 5);
        Passenger p4 = new NonMember("Clint Eastwood", 92);
        
        m.createFlights();
        m.displayAvailableFlights("Toronto", "Miami");
        m.displayAvailableFlights("Tokyo", "Toronto");
        m.displayAvailableFlights("Vancouver", "London");
        System.out.println("\n");
       
        m.bookSeat(1, p1);
        m.displayAvailableFlights("Toronto", "Miami");
        m.displayAvailableFlights("Tokyo", "Toronto");
        m.displayAvailableFlights("Vancouver", "London");
        System.out.println("\n");
        
        m.bookSeat(2, p2);
        m.displayAvailableFlights("Toronto", "Miami");
        m.displayAvailableFlights("Tokyo", "Toronto");
        m.displayAvailableFlights("Vancouver", "London");
        System.out.println("\n");
       
        m.bookSeat(3, p3);
        m.displayAvailableFlights("Toronto", "Miami");
        m.displayAvailableFlights("Tokyo", "Toronto");
        m.displayAvailableFlights("Vancouver", "London");
        System.out.println("\n");
        
        m.bookSeat(1, p4);
        m.displayAvailableFlights("Toronto", "Miami");
        m.displayAvailableFlights("Tokyo", "Toronto");
        m.displayAvailableFlights("Vancouver", "London");
        System.out.println("\n");
    }
    
}
