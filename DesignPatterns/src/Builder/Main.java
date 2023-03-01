package Builder;

public class Main {

    public static void main(String[] args)
    {
        carWithBuilder car1 = carWithBuilder.builder()
                .withEngine(new carEngine())
                .withBrakes(new carBrakes())
                .withGearBox((new carGearBox())).build();

        carWithBuilder car2 = carWithBuilder.builder()
                .withEngine(new carEngine())
                .withBrakes(new carBrakes())
                .withGearBox((new carGearBox()))
                .withSterio(new carSterio())
                .withSunroof(new carSunroof()).build();
    }
}
