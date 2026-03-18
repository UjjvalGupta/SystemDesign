import Observable.DeviceObservable;
import Observable.IphoneObservableImpl;
import Observer.DeviceObserver;
import Observer.EmailObserverImpl;
import Observer.SmsObserverImpl;

public class ObserverDesignMain {
    public static void main(String[] args) {
        DeviceObservable observable = new IphoneObservableImpl();
        DeviceObserver observer = new SmsObserverImpl();
        observable.add(new EmailObserverImpl());
        observable.add(new SmsObserverImpl());
        observable.add(observer);
        observable.setData(0);
        observable.remove(observer);
        observable.setData(0);

    }
}
