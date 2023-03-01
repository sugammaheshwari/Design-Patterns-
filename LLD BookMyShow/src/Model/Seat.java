package Model;

public class Seat {

    private int seatNo;
    private SeatStatus seatStatus;
    private String bookerName;

    public Seat(int seatNo)
    {
        seatNo = seatNo;
        seatStatus = SeatStatus.UNLOCKED;
    }

    public boolean isSeatAvailable()
    {
        return seatStatus==SeatStatus.UNLOCKED;
    }

    public void bookSeat(String bookerName)
    {
        this.seatStatus = SeatStatus.BOOKED;
        this.bookerName = bookerName;
    }

    public void blockSeat(String bookerName)
    {
        this.seatStatus = seatStatus.LOCKED;
        this.bookerName = bookerName;
    }

    public void unblockSeat()
    {
        this.seatStatus = seatStatus.UNLOCKED;
        this.bookerName = "";
    }

    public String getBookerName()
    {
        return bookerName;
    }
}
