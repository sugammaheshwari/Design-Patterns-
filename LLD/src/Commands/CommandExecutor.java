package Commands;

import Service.ParkingLotService;
import objects.Command;
import objects.ParkingLot;

public abstract class CommandExecutor {
    protected ParkingLotService parkingLotService;
        /*
            Since we have to give parkingLotService reference to all the command which will extend CommandExecutor
            Thats why we cant make CommandExecutor as an interface, because an interface data members are public,static and final by default
            Therefore abstract class is used here !!!1
         */

    public CommandExecutor(ParkingLotService parkingLotService)
    {
        this.parkingLotService = parkingLotService;
    }

    public abstract void validate(Command command);
    public abstract void execute(Command command);
}
