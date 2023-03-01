package Service;

import Objects.Player;
import Objects.Point;

import java.util.List;

public class PlayerAttackingService {

    private List<Player> playerList;

    public boolean AttackPlayer(String attackFrom, String attackTo, Point attackingPoint)
    {
        if(attackFrom == attackTo) return false;
        for(Player p:playerList)
        {
            if(p.getPlayerName()==attackTo)
            {
                if(p.attackMoveOnBoard(attackingPoint,attackFrom))
                    return true;
            }
        }
        return false;
    }
}
