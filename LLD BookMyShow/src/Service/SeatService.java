package Service;

import Model.Seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatService {

    private Map<Integer, List<Seat>> seatListMapForShow = new HashMap<Integer,List<Seat>>();

    public void registerSeatsForShow(Integer showId,List<Seat> seatList)
    {
        seatListMapForShow.put(showId,seatList);
    }

    public List<Seat> getAvailableSeatsInShow(int showID)
    {
        List<Seat> avSeats=new ArrayList<Seat>();
        List<Seat> seatList = seatListMapForShow.get(showID);

        for(Seat seat:seatList)
        {
            if(seat.isSeatAvailable())
                avSeats.add(seat);
        }
        return avSeats;
    }

    public boolean blockSeatsInShow(int show,List<Integer> seatList,String bookerName)
    {
        for(Integer idx:seatList)
            if(seatListMapForShow.get(show).get(idx).isSeatAvailable()==false)
                return false;

        for(Integer idx:seatList)
            seatListMapForShow.get(show).get(idx).blockSeat(bookerName);

        return true;
    }

    public boolean bookSeatsInShow(int show,List<Integer> seatList,String bookerName)
    {
        for(Integer idx:seatList)
            if(seatListMapForShow.get(show).get(idx).isSeatAvailable()==false || seatListMapForShow.get(show).get(idx).getBookerName()!=bookerName)
                return false;

        for(Integer idx:seatList)
            seatListMapForShow.get(show).get(idx).blockSeat(bookerName);

        return true;
    }

}
