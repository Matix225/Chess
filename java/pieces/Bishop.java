package pieces;

import manage.GameManager;

public class Bishop extends Piece{
    public Bishop(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        return false;
    }
}
