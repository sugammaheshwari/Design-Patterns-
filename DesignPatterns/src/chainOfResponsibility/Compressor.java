package chainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean handle(HttpRequest request) {
        System.out.println("Compressing!");
        return false;
    }
}
