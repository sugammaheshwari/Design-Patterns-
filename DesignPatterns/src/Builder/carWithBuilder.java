package Builder;
public class carWithBuilder {
    // required properties
    private carBrakes brakes;private carGearBox gbox;private carEngine engine;
    // optional properties
    private carSterio sterio;private carSunroof sunroof;
    public static builder builder() {return new builder();}
    public static class builder{

        private carBrakes brakes;private carGearBox gbox;private carEngine engine;
        private carSterio sterio;private carSunroof sunroof;
        public builder withBrakes(carBrakes brakes) {this.brakes = brakes;return this;}
        public builder withGearBox(carGearBox gbox) {this.gbox = gbox;return this;}
        public builder withEngine(carEngine engine) {this.engine = engine;return this;}
        public builder withSunroof(carSunroof sunroof) {this.sunroof = sunroof;return this;}
        public builder withSterio(carSterio sterio) {this.sterio = sterio;return this;}

        public carWithBuilder build()
        {
            if(this.engine == null || this.gbox == null || this.brakes == null)
            {throw new RuntimeException("All Req properties are not present!!!!");}
            carWithBuilder car = new carWithBuilder();
            car.engine = this.engine;
            car.brakes = this.brakes;
            car.gbox = this.gbox;
            car.sunroof = this.sunroof;
            car.sterio = this.sterio;
            return car;
        }
    }
}
