package pieces;

import manage.GameManager;

public class King extends Piece{
    public King(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(i == this.x && j == this.y)
                    continue;

                if( (newX == this.x - i) && (newY == this.y - j) )
                    return true;
            }
        }
        return false;
    }
}
