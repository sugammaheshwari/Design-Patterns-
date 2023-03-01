package Service;

import Model.Booking;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {

    private SeatService seatService;
    private int bookingId;
    private Map<Integer,Booking> bookingMap;

    public BookingService(SeatService seatService) {
        this.seatService = seatService;
        bookingId = 0;
        bookingMap = new HashMap<Integer,Booking>();
    }

    public boolean blockSeats(int showID,List<Integer> seatIdxToBeBooked,String bookerName)
    {
        if(seatService.blockSeatsInShow(showID,seatIdxToBeBooked,bookerName))
            return true;
        return false;
    }

    public boolean bookSeats(int showID, List<Integer> seatIdxToBeBooked, String bookerID)
    {
        if(seatService.bookSeatsInShow(showID,seatIdxToBeBooked,bookerID))
        {
            Booking booking = new Booking(bookingId,seatIdxToBeBooked);
            bookingMap.put(bookingId,booking);
            return true;
        }
        return false;
    }

}
