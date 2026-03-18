package Classes;

import Enums.Direction;
import Enums.DispatcherStrategy;

import java.util.ArrayList;
import java.util.List;

public class ExternalButtonDispatcher {

    private List<ElevatorController> elevatorControllerList;

    public ExternalButtonDispatcher(){
        elevatorControllerList = new ArrayList<>();
    }

    public void addElevatorController(int id){
        elevatorControllerList.add(new ElevatorController(id));
    }

    public void addRequest(int floorNumber, int destinationFloor, Direction direction) {
        
    }
}
