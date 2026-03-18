package Observer;

import Observable.IphoneObservableImpl;

public class EmailObserverImpl implements DeviceObserver{
    @Override
    public void update(Object observable) {
        if(observable instanceof IphoneObservableImpl){
            System.out.println("Iphones stock sending email" + ((IphoneObservableImpl) observable).getData());
        } else {
            System.out.println("Invalid email");
        }
    }
}
