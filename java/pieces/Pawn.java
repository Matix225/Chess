package pieces;

import manage.GameManager;

public class Pawn extends Piece{
    public Pawn(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        if(this.color == Color.WHITE){
            if( (newX == this.x - 1) && (newY == this.y) ) //move for 1 unit
                return true;
            else if( (newX == this.x - 2) && (newY == this.y) ) //move for 2 units
                return true;

            return false;
        }
        else{
            if( (newX == this.x + 1) && (newY == this.y) ) //move for 1 unit
                return true;
            else if( (newX == this.x + 2) && (newY == this.y) ) //move for 2 units
                return true;

            return false;
        }
    }
}
