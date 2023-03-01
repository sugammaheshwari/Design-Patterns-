package Objects;

public class AttackedPoint extends Point{

    private String attackedByPlayerName;

    public AttackedPoint(int x, int y,String attackedByPlayerName) {
        super(x, y);
        this.attackedByPlayerName = attackedByPlayerName;
    }
}
