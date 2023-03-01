package Commands;

import Service.ParkingLotService;
import Strategy.ClosetFirstParkingStrategy;
import objects.Command;
import objects.ParkingLot;

import java.util.List;

public class CreateParkingLotCommand extends CommandExecutor{
    public CreateParkingLotCommand(ParkingLotService parkingLotService) {
        super(parkingLotService);
    }

    @Override
    public void validate(Command command) {

    }

    @Override
    public void execute(Command command) {
        List<String> params = command.getParams();
        ParkingLot parkingLot = new ParkingLot( Integer.valueOf(params.get(0)));
        parkingLotService.InitialiseParkingLotService(parkingLot,new ClosetFirstParkingStrategy(parkingLot));
    }
}
