package command;

public class addCustomerCommand implements command{

    private customerService service;

    public addCustomerCommand(customerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
