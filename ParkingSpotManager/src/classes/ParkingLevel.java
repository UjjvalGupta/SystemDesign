package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLevel {

    private List<ParkingSpot> spots;
    private Map<Vehicle, ParkingSpot> vehicleParkingSpotMap;
    private int capacity;
    private int levelNumber;

    ParkingLevel(int capacity, int levelNumber){
        this.spots = new ArrayList<>();
        this.capacity = capacity;
        this.levelNumber = levelNumber;
        this.vehicleParkingSpotMap = new HashMap<>();
    }

    public List<ParkingSpot> getSpots(){
        return spots;
    }

    public int parkVehicle(Vehicle v) {
        for(ParkingSpot spot: spots){
            if(spot.canFitVehicle(v)){
                spot.addVehicle(v);
                vehicleParkingSpotMap.put(v, spot);
                return spot.getId();
            }
        }
        return -1;
    }

    public void removeVehicle(Vehicle v) {
        ParkingSpot spot = vehicleParkingSpotMap.get(v);
        if(spot!=null) {
            spot.removeVehicle();
        }
    }

    public void addSpot(ParkingSpot spot){
        if(spots.size() < capacity){
            spots.add(spot);
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
