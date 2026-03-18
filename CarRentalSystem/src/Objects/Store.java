package Objects;

import enums.VehicleType;

import java.util.*;

public class Store {
    int storeId;
    List<Vehicle> vehicles;

    public Store(int storeId) {
        this.storeId = storeId;
        vehicles = new ArrayList<>();
    }

    public int getStoreId() {
        return storeId;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public Map<VehicleType, List<Vehicle>> getVehicleTypeAndCount(){
        Map<VehicleType, List<Vehicle>> response = new HashMap<>();
        vehicles.forEach(vehicle -> {
            List<Vehicle> vehicles = response.get(vehicle.getVehicleType());
            if(vehicles != null){
                vehicles.add(vehicle);
            } else {
                vehicles = new ArrayList<>();
                vehicles.add(vehicle);
            }
            response.put(vehicle.getVehicleType(), vehicles);
        });
        return response;
    }


}
