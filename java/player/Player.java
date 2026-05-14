package player;
import manage.GameManager;
import pieces.Color;

public abstract class Player{
    protected final Color pieceColor;
    protected final GameManager game;


    public Player(Color color, GameManager game){
        this.pieceColor = color;
        this.game = game;
    }
    public Color getPieceColor() {
        return pieceColor;
    }
    public abstract void makeMove();
}
