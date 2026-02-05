
package transport.management.system;

public abstract class Transport {
    int passengerId;
    String passengerName;
    String fromCity;
    String toCity;
    double distance;
    double fare;
    
    Transport(int passengerId,String passengerName,String fromCity,String toCity,double distance){
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
       
        
    }
    abstract void calculateFare();
    void displayTicket(){
        System.out.println("PassengerId :: "+passengerId);
        System.out.println("Passenger Name : "+passengerName);
        System.out.println("Route : "+fromCity+" -> "+toCity);
        System.out.println("Distance :: "+distance);
        System.out.println("Toatal Fare : "+fare);
    }
    
}
