package classes;

import Enums.VehicleType;

public class Bus extends Vehicle {
    public Bus(int vehicleNumber) {
        super(vehicleNumber, VehicleType.LARGE);
    }

    @Override
    public boolean canFitInSpot(VehicleType parkingSpot) {
        System.out.println("I am here: " + vehicleType + parkingSpot);
        return vehicleType.equals(parkingSpot);
    }
}
