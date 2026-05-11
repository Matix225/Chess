package pieces;

import manage.GameManager;

public class Knight extends Piece{
    public Knight(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        if((newX == x-2 && newY == y-1) || (newX == x-2 && newY == y+1))
            return true;
        else if((newX == x+2 && newY == y-1) || (newX == x+2 && newY == y+1))
            return true;

        return false;
    }
}
