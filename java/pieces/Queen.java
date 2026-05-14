package pieces;

import manage.GameManager;

public class Queen extends Piece{
    public Queen(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        return false;
    }
}
