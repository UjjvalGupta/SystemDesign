package Observable;

import Observer.DeviceObserver;

public interface DeviceObservable {

    void add(DeviceObserver observer);

    void remove(DeviceObserver observer);

    void notifyObserver();

    void setData(int currentStock);

    int getData();
}
