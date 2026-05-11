package pieces;

import manage.GameManager;

public class King extends Piece{
    public King(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        return false;
    }
}
