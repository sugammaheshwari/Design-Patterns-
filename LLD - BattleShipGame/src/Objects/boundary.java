package Objects;

import java.util.List;

public interface boundary {

    List<Point> getPointsWithinBoundary();

    public boolean checkPointValidityWithinBoundary(int x,int y);
}
