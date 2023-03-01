package Service;

import Strategy.ParkingStrategy;
import objects.Car;
import objects.ParkingLot;
import objects.ParkingSpot;
import objects.Vehicle;

import java.util.List;

public class ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingStrategy parkingStrategy;

    public void InitialiseParkingLotService(ParkingLot parkingLot,ParkingStrategy parkingStrategy)
    {
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;
    }

    public void parkVehicle(String vehicleRegNo)
    {
        int freeparkingSpot = parkingStrategy.getNextAvailableParkingSlot();
        if(freeparkingSpot>-1)
        {
            Vehicle vehicle = new Car(vehicleRegNo);
            parkingLot.parkVehicle(vehicle,freeparkingSpot);
        }
    }

    public void unparkVehicle(String vehicleNo)
    {
        List<ParkingSpot> parkingSpotList = parkingLot.getParkingSpotList();
                // this could be optimised map, or a service can be written to find parkedSpotIndex.
        for(int i=0;i<parkingSpotList.size();i++)
            if(parkingSpotList.get(i).checkParkedStatus()==true && parkingSpotList.get(i).getParkedVehicleNumber()==vehicleNo)
            {
                parkingLot.unparkVehicle(i);
            }
    }
}
