package objects;

import Exceptions.ParkingLotFullException;

public class ParkingSpot {
    private Vehicle parkedVehicle=null;

    void park(Vehicle vehicle)
    {
        if(parkedVehicle!=null) new ParkingLotFullException();
        else {
            parkedVehicle = vehicle;
        }
    }

    public boolean checkParkedStatus()
    {
        return parkedVehicle==null?false:true;
    }

    void unpark()
    {
        parkedVehicle = null;
    }

    public String getParkedVehicleNumber()
    {
        return parkedVehicle.getRegistrationNO();
    }
}
