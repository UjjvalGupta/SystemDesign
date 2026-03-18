package Observer;

import Observable.IphoneObservableImpl;

public class SmsObserverImpl implements DeviceObserver{
    @Override
    public void update(Object observable) {
        if(observable instanceof IphoneObservableImpl){
            System.out.println("Iphones stock sending sms" + ((IphoneObservableImpl) observable).getData());
        } else {
            System.out.println("Invalid sms");
        }
    }
}
