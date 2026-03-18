package Observable;

import Observer.DeviceObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IphoneObservableImpl implements DeviceObservable{

    List<DeviceObserver> objects;
    int currentStock;

    @Override
    public void add(DeviceObserver observer) {
        if(Objects.nonNull(objects)){
            objects.add(observer);
        } else {
            objects = new ArrayList<>();
            objects.add(observer);
        }
    }

    @Override
    public void remove(DeviceObserver observer) {
        objects.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (DeviceObserver observer : objects){
            observer.update(this);
        }
    }

    @Override
    public void setData(int newStock) {
        currentStock = newStock;
        if(currentStock == 0){
            notifyObserver();
        }
    }

    @Override
    public int getData() {
        return currentStock;
    }
}
