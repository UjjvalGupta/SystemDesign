import Enums.VehicleType;
import classes.*;

import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ParkingLot lot = new ParkingLot(3);
        lot.addLevel(1, 1);
        lot.addLevel(2, 2);
        lot.addLevel(3, 3);

        List<ParkingLevel> levelList = lot.getLevels();
        levelList.get(0).addSpot(new ParkingSpot(123, VehicleType.LARGE));
        levelList.get(0).addSpot(new ParkingSpot(124, VehicleType.MEDIUM));
        levelList.get(1).addSpot(new ParkingSpot(125, VehicleType.SMALL));
        levelList.get(2).addSpot(new ParkingSpot(126, VehicleType.MEDIUM));
        levelList.get(2).addSpot(new ParkingSpot(127, VehicleType.LARGE));
        levelList.get(2).addSpot(new ParkingSpot(128, VehicleType.SMALL));

        Vehicle vehicle = new Bus(1234);
        Map.Entry<Integer, Integer> map = lot.parkVehicle(vehicle);
        if(map != null){
            System.out.println("Vehicle: " + vehicle.getVehicleNumber() + " parked at level: " + map.getKey() + " at spot: " + map.getValue());
        }
        vehicle = new MotorCycle(1235);
        map = lot.parkVehicle(vehicle);
        if(map != null){
            System.out.println("Vehicle: " + vehicle.getVehicleNumber() + " parked at level: " + map.getKey() + " at spot: " + map.getValue());
        }
        vehicle = new Bus(1236);
        map = lot.parkVehicle(vehicle);
        if(map != null){
            System.out.println("Vehicle: " + vehicle.getVehicleNumber() + " parked at level: " + map.getKey() + " at spot: " + map.getValue());
        }





    }
}