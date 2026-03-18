package Objects;

import enums.LocationType;

import java.util.List;

public class CarRentalSystem {

    private List<Location> locations;

    private void addLocation(LocationType locationType, String locationValue){

        locations.add(new Location());
    }

    private void removeLocation(){

    }

    private void addStoreAtLocation(String locationValue, int storeId){
        for(Location location: locations){
            if(location.getLocationValue().equalsIgnoreCase(locationValue)){
                location.addStore(storeId);
            }
        }
    }

    private List<Location> getAllLocations(){
        return locations;
    }




}
