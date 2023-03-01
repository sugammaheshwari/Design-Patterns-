package Commands;

import Service.ParkingLotService;
import objects.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutorFactory {
    private Map<String,CommandExecutor> commands = new HashMap<String,CommandExecutor>();

    CommandExecutorFactory(ParkingLotService parkingLotService)
    {
        commands.put("CREATE_PARKING_LOT", new CreateParkingLotCommand(parkingLotService));
        commands.put("PARK_VEHICLE",new ParkVehicleCommand(parkingLotService));
        commands.put("UNPARK_VEHICLE",new UnparkVehicleCommand(parkingLotService));
    }

    public void ExecuteRespectiveCommand(Command command)
    {
        commands.get(command.getType()).execute(command);
    }
}
