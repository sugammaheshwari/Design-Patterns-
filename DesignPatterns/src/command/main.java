package command;

public class main {
    public static void main(String[] args)
    {
        var cs = new customerService();
        var add_cs_cmd = new addCustomerCommand(cs);
        var button = new button(add_cs_cmd);

        button.click();
    }
}
