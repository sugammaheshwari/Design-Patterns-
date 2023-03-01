package chainOfResponsibility;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }
    @Override
    public boolean handle(HttpRequest request) {
        System.out.println("logging");
        return true;
    }
}
