package manage;
import pieces.*;
import player.Human;
import java.util.Random;

public class GameManager {
    private Piece[][] board;
    private final int width = 8;
    private final int height = 8;
    private final Human pl;

    //init functions
    public GameManager(){
        board = new Piece[width][height];

        createBlackPiece();
        createWhitePiece();

        Random random = new Random();
        if(random.nextBoolean()){
            pl = new Human(Color.WHITE,this);
        }
        else{
            pl = new Human(Color.BLACK, this);
        }
    }
    public void createWhitePiece(){
        //create pawn line
        for(int i = 0; i < width; i++){
            board[6][i] = new Pawn(6, i, Color.WHITE, '♙', this);
        }

        //create knights
        board[7][1] = new Knight(7, 1, Color.WHITE, '♘', this);
        board[7][6] = new Knight(7, 6, Color.WHITE, '♘', this);

        board[7][4] = new King(7, 4, Color.WHITE, '♔', this);
    }
    public void createBlackPiece(){
        //create pawn line
        for(int i = 0; i < width; i++){
            board[1][i] = new Pawn(1, i, Color.BLACK, '♟', this);
        }

        //create knights
        board[0][1] = new Knight(0, 1, Color.BLACK, '♞', this);
        board[0][6] = new Knight(0, 6, Color.BLACK, '♞', this);

        //create king
        board[0][4] = new King(0, 4, Color.BLACK, '♚', this);
    }

    //getters and setters
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public Piece getPiece(int x, int y){
        return board[x][y];
    }
    public void setPiece(Piece p, int x, int y){
        board[p.getX()][p.getY()] = null;
        p.setX(x);
        p.setY(y);
        board[x][y] = p;
    }

    //game logic
    public void startGame(){
        while(true){
            printBoard();
            pl.makeMove();
        }
    }
    public void printBoard(){
        if(pl.getPieceColor() == Color.BLACK){
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    if(board[i][j] == null)
                        System.out.print(" ");
                    else
                        System.out.print(board[i][j].getRep());
                }
                System.out.print('\n');
            }
        }
        else{
            for(int i = 7; i >= 0; i--){
                for(int j = 7; j >= 0; j--){
                    if(board[i][j] == null)
                        System.out.print(" ");
                    else
                        System.out.print(board[i][j].getRep());
                }
                System.out.print('\n');
            }
        }
    }
}