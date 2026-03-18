package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class ParkingLot {
    private int capacity;
    private List<ParkingLevel> levels;
    private Map<Vehicle, ParkingLevel> parkingLevelVehicleMap;

    public ParkingLot(int capacity){
        this.capacity = capacity;
        levels = new ArrayList<>();
        parkingLevelVehicleMap = new HashMap<>();
    }

    public Map.Entry<Integer, Integer> parkVehicle(Vehicle v){
        for(ParkingLevel level: levels){
            int spot = level.parkVehicle(v);
            if(spot != -1){
                parkingLevelVehicleMap.put(v, level);
                return Map.entry(level.getLevelNumber(), spot);
            }
        }
        return null;
    }

    public void removeVehicle(Vehicle v){
        ParkingLevel level = parkingLevelVehicleMap.get(v);
        if(level != null){
            level.removeVehicle(v);
        }
    }

    public void addLevel(int capacity, int levelNumber){
        if(levels.size() < this.capacity){
            ParkingLevel level = new ParkingLevel(capacity, levelNumber);
            levels.add(level);
        }
    }


    public List<ParkingLevel> getLevels() {
        return levels;
    }
}
