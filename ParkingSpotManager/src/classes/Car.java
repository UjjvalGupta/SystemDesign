package classes;

import Enums.VehicleType;

public class Car extends Vehicle{

    Car(int vehicleNumber) {
        super(vehicleNumber, VehicleType.MEDIUM);
    }

    @Override
    public boolean canFitInSpot(VehicleType parkingSpot) {
        return vehicleType.equals(parkingSpot) || VehicleType.LARGE.equals(parkingSpot);
    }
}
