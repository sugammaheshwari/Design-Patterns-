package Objects;

import Strategy.playerAttackingStrategy;

public class Player {

    private String playerName;
    private Board playerBoard;
    private playerAttackingStrategy strategy;

    public Player(String playerName,Board playerBoard, playerAttackingStrategy strategy) {
        this.playerBoard = playerBoard;
        this.strategy = strategy;
        playerName = playerName;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public boolean attackMoveOnBoard(Point attackingPoint,String attackerName)
    {
        return playerBoard.gotAttacked(attackingPoint,attackerName);
    }

}
