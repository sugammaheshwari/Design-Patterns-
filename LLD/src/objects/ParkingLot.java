package objects;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> parkingSpotList = new ArrayList<ParkingSpot>();

    public ParkingLot(int parkingLotSize)
    {
        for(int i=0;i<parkingLotSize;i++)
            parkingSpotList.add(new ParkingSpot());
    }

    public List<ParkingSpot> getParkingSpotList()
    {
        return this.parkingSpotList;
    }

    public void parkVehicle(Vehicle vehicle,int parkingSpotNumber)
    {
        parkingSpotList.get(parkingSpotNumber).park(vehicle);
    }

    public void unparkVehicle(int parkingSpotNumber)
    {
        parkingSpotList.get(parkingSpotNumber).unpark();
    }
}
