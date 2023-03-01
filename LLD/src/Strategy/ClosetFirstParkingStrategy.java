package Strategy;

import Exceptions.ParkingLotFullException;
import objects.ParkingLot;
import objects.ParkingSpot;

import java.util.List;

public class ClosetFirstParkingStrategy implements ParkingStrategy{

    private ParkingLot parkingLot;

    public ClosetFirstParkingStrategy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public int getNextAvailableParkingSlot() {

        List<ParkingSpot> parkingSpotList = parkingLot.getParkingSpotList();
        int parkingSplotListSize = parkingSpotList.size();
        for(int i=0;i<parkingSplotListSize;i++)
        {
            if(parkingSpotList.get(i).checkParkedStatus()==false)
            {
                return i;
            }
        }
        new ParkingLotFullException();
        return -1;
    }
}
