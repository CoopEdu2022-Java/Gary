package twotwo;
import java.time.LocalTime;
public class H2 {
    public static void main(String[] args) {
        
    }
}
class ariplain{
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private boolean delayed;
    public ariplain(int flightNumber, String destination, LocalTime departureTime, boolean delayed) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = delayed;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
     public void checkStatus() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);

        if (delayed) {
            System.out.println("Status: Delayed");
        } else {
            System.out.println("Status: On Time");
        }
    }

}