package Classes;

import Enums.Direction;
import Enums.DispatcherStrategy;
import Enums.Status;

public class Elevator {

    private int id;
    private Display display;
    private Status status;
    private InternalButtonDispatcher internalButtonDispatcher;

    public Elevator(int id){
        this.id = id;
        display = new Display();
        status = Status.IDLE;
        internalButtonDispatcher = new InternalButtonDispatcher();
    }

    void pressButton(int destinationFloor){
        internalButtonDispatcher.addRequest(destinationFloor, id, display);
    }



}
