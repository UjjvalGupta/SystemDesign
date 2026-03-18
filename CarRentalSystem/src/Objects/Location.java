package Objects;

import enums.LocationType;

import java.util.List;

public class Location {
    private LocationType locationType;
    private String locationValue;
    List<Store> stores;

    public String getLocationValue() {
        return locationValue;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void addStore(int storeId) {
        stores.add(new Store(storeId));

    }

    public void removeStore(int storeId) {

    }

    private void addVehicleAtStore(int storeId, Vehicle v) {
        for(Store store: stores){
            if(store.getStoreId() == storeId){
                store.addVehicle(v);
                break;
            }
        }
    }

    private List<Store> getAllStores(){
        return stores;
    }

}
