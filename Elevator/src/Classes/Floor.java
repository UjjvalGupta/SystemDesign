package Classes;

import Enums.Direction;
import Enums.DispatcherStrategy;

public class Floor {
    private int floorNumber;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void pressButton(int destinationFloor, ExternalButtonDispatcher externalButtonDispatcher){
        Direction direction;
        if(destinationFloor>floorNumber){
            direction = Direction.UP;
        } else {
            direction = Direction.DOWN;
        }
        externalButtonDispatcher.addRequest(floorNumber, destinationFloor, direction);

    }
}
