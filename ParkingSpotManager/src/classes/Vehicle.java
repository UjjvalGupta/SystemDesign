package classes;

import Enums.VehicleType;

public abstract class Vehicle {
    int vehicleNumber;
    VehicleType vehicleType;

    Vehicle(int vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public abstract boolean canFitInSpot(VehicleType parkingSpot);

    public int getVehicleNumber() {
        return vehicleNumber;
    }
}
