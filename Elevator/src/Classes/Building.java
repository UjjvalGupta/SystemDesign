package Classes;

import Enums.DispatcherStrategy;

import java.util.ArrayList;
import java.util.List;

public class Building {

    List<Floor> floors;

    public Building(){
        floors = new ArrayList<>();
    }

    public void addFloor(int floorNumber){
        floors.add(new Floor(floorNumber));
    }

    public void removeFloor(int floorNumber) {
        for(Floor floor: floors){
            if(floor.getFloorNumber() == floorNumber){
                floors.remove(floor);
                break;
            }
        }
    }
}
