package pieces;

import manage.GameManager;

public class Rook extends Piece{
    public Rook(int x, int y, Color color, char rep, GameManager game){
        super(x, y, color, rep, game);
    }
    @Override
    public boolean canMove(int newX, int newY){
        if(newX > this.x){
            for(int i = this.x + 1; i < 8; i++){//go to the bootom of the board
                if(game.getPiece(i, this.y) != null) // other piece is blocking the way
                    return false;
                if(i == newX && this.y == newY)
                    return true;
            }
        }
        else if (newX < this.x){
            for(int i = this.x - 1; i >= 0; i--){//go to the top of the board
                if(game.getPiece(i, this.y) != null) // other piece is blocking the way
                    return false;
                if(i == newX && this.y == newY)
                    return true;
            }
        }

        if(newY > this.y){//check move to the right side of the board
            for(int i = this.y+1; i < 8; i++){
                if(game.getPiece(this.x, i) != null)// other piece is blocking the way
                    return false;
                if( (newX == this.x) && (i == newY) )
                    return true;
            }
        }
        else if(newY < this.y){//check move to the left side of the board
            for(int i = this.y - 1; i >= 0; i--){
                if(game.getPiece(this.x, i) != null)// other piece is blocking the way
                    return false;
                if( (newX == this.x) && (i == newY) )
                    return true;
            }
        }

        return false;
    }
}
