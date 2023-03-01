package command;

public class button {

    private String label;
    private command command;

    public button(command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
