package observerPush;

public class spreadSheet implements Observer{
    @Override
    public void update(int val) {
        System.out.println("Got update from Subject :"+val);
    }
}
