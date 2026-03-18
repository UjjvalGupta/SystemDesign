package classes;

import Enums.VehicleType;

public class MotorCycle extends Vehicle{
    public MotorCycle(int vehicleNumber) {
        super(vehicleNumber, VehicleType.SMALL);
    }

    @Override
    public boolean canFitInSpot(VehicleType parkingSpot) {
        return true;
    }
}
