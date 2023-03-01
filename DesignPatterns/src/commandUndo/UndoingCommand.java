package commandUndo;

public class UndoingCommand implements Command{

    private History historty;

    public UndoingCommand(History historty) {
        this.historty = historty;
    }

    @Override
    public void execute() {
        historty.pop().unexecute();
    }
}
