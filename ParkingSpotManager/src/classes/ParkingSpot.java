package classes;

import Enums.VehicleType;

public class ParkingSpot {
    private Vehicle vehicle;
    boolean isEmpty;
    private int id;
    VehicleType parkingSpotType;

    public ParkingSpot(int id, VehicleType parkingSpotType){
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.parkingSpotType = parkingSpotType;
    }

    void addVehicle(Vehicle v){
        vehicle = v;
        isEmpty = false;
    }

    void removeVehicle(){
        vehicle = null;
        isEmpty = true;
    }

    boolean canFitVehicle(Vehicle vehicle){
        return this.isEmpty && vehicle.canFitInSpot(this.parkingSpotType);
    }

    public int getId() {
        return id;
    }
}
