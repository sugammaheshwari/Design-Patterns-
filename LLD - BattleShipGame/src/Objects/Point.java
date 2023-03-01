package Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean checkEquality(int x,int y)
    {
        if(this.x==x && this.y==y) return true;
        return false;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
