package objects;

public class Car implements Vehicle {

    private String RegNo;

    public Car(String regNo)
    {
        this.RegNo = regNo;
    }

    public String getRegistrationNO()
    {
        return RegNo;
    }
}
