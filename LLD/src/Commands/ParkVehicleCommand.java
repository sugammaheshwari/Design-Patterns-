package Commands;

import Service.ParkingLotService;
import objects.Command;

public class ParkVehicleCommand extends CommandExecutor{
    public ParkVehicleCommand(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void validate(Command command) {

    }

    @Override
    public void execute(Command command) {
        String vehicleRegNo = command.getParams().get(0);
        parkingLotService.parkVehicle(vehicleRegNo);
    }
}
