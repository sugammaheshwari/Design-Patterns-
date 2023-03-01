package Objects;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.List;

public class RectangularBoundary implements boundary {

    private int m,n;

    public RectangularBoundary(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public List<Point> getPointsWithinBoundary() {

        List<Point> points = new ArrayList<Point>();

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                points.add(new Point(i,j));
            }
        }

        return points;
    }

    @Override
    public boolean checkPointValidityWithinBoundary(int x, int y) {

        if(x>m || y>n || x<0 || y<0)
            return false;
        else
            return true;
    }
}
