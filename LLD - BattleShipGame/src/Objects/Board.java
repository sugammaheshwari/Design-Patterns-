package Objects;

import java.util.List;

public class Board {

    private boundary boardBoundary;
    private List<Point> pointsOnBoard;

    public Board(boundary boardBoundary) {
        this.boardBoundary = boardBoundary;
        pointsOnBoard = boardBoundary.getPointsWithinBoundary();
    }

    public boolean gotAttacked(Point attackedPoint,String attackerName)
    {
        int x = attackedPoint.getX();int y=attackedPoint.getY();

        if(!boardBoundary.checkPointValidityWithinBoundary(x,y))
            return false;
        for(Point p:pointsOnBoard)
        {
            if(p.checkEquality(x,y) && !(p instanceof AttackedPoint))
            {
                pointsOnBoard.remove(p);
                pointsOnBoard.add(new AttackedPoint(x,y,attackerName));
                return true;
            }
        }
        return false;
    }

    public List<Point> getBoardState()
    {
        return pointsOnBoard;
    }
}
