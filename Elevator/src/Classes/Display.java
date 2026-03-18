package Classes;

import Enums.Direction;

public class Display {
    private int floor;
    private Direction direction;

    public Display(){
        floor = 0;
        direction = Direction.STATIC;
    }

    public int getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }
}
