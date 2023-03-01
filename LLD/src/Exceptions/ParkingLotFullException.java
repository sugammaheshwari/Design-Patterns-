package Exceptions;

public class ParkingLotFullException {
    public ParkingLotFullException() throws RuntimeException
    {
        throw new RuntimeException("ParkingSpace already FUll!!!!");
    }
}
