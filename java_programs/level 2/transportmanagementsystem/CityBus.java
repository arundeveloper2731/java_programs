
package transport.management.system;


public class CityBus extends Transport
{

    public CityBus(int passengerId, String passengerName, String fromCity, String toCity, double distance) {
        super(passengerId, passengerName, fromCity, toCity, distance);
    }

    

    @Override
    void calculateFare() {
        fare = distance * 5;
    }
    
}
