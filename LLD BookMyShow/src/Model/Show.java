package Model;

import Service.SeatService;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private Movie currentMovie;
    private SeatService seatService;
    private int startTime,endTime;
    private int showId;

    public Show(int showId,Movie currentMovie, List<Seat> seatList, int startTime, int endTime) {
        this.showId = showId;
        this.currentMovie = currentMovie;
        this.startTime = startTime;
        this.endTime = endTime;
        seatService.registerSeatsForShow(showId,seatList);
    }
}
