package Model;

import java.util.List;

public class Booking {

    private int bookingId;
    private List<Integer> seatsBooked;

    public Booking(int bookingId, List<Integer> seatsBooked) {
        this.bookingId = bookingId;
        this.seatsBooked = seatsBooked;
    }
}
