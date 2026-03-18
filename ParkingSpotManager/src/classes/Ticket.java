package classes;

import java.util.Date;

public class Ticket {
    private Date startTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    Ticket(Vehicle vehicle, ParkingSpot spot){
        this.startTime = new Date();
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public Long getDuration(){
        Date endTime = new Date();
        return (endTime.getTime() - startTime.getTime()) / (1000 * 60);
    }
}
