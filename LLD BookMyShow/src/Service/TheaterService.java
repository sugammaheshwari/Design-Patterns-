package Service;

import Model.Movie;
import Model.Seat;
import Model.Show;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TheaterService {

    private static int showCounter = 0 ;
    private String theaterName;
    private Map<Integer,Show> showsInTheater;

    private SeatService seatService;

    public void addShow(String movieName,int startTime,int endTime)
    {
        Movie movie = new Movie(movieName);
        List<Seat> seatList = new ArrayList<Seat>();
        for(int i=0;i<100;i++)
        {
            Seat seat  = new Seat(i);
            seatList.add(seat);
        }
        showsInTheater.put(showCounter,new Show(showCounter,movie,seatList,startTime,endTime));
        showCounter++;
    }

    public Show getShow(int showIdx)
    {
        return showsInTheater.get(showIdx);
    }

    public TheaterService(String theaterName) {
        this.theaterName = theaterName;
    }
}
