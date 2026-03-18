package Classes;

import Enums.DispatcherStrategy;

public class ElevatorController {
    private Elevator elevator;

    public ElevatorController(int id){
        this.elevator = new Elevator(id);
    }
}
