package Objects;

import enums.VehicleType;

public class Vehicle {
    private VehicleType vehicleType;
    private String model;
    private String manufacturer;
    private String make;
    private int quantity;
    private int pricePerDay;

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
