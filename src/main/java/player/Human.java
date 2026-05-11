package player;
import manage.GameManager;
import pieces.Color;
import pieces.Piece;
import java.util.Scanner;

public class Human extends Player{
    public Human(Color color, GameManager game){
        super(color, game);
    }

    @Override
    public void makeMove(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int piecePosX, piecePosY;
            System.out.println("Choose piece (type his cords): ");
            piecePosX = sc.nextInt();
            piecePosY = sc.nextInt();
            if(validPos(piecePosX, piecePosY)){
                System.out.println("X and Y should be from 1 to 8!");
                continue;
            }

            Piece p = game.getPiece(piecePosX-1, piecePosY-1);
            if(p == null || p.getColor() == this.pieceColor){
                System.out.println("This is not your pawn!");
                continue;
            }

            int newX, newY;
            System.out.println("Choose new position(type cords): ");
            newX = sc.nextInt();
            newY = sc.nextInt();
            if(validPos(piecePosX, piecePosY)){
                System.out.println("X and Y should be from 1 to 8!");
                continue;
            }

            if(p.canMove(newX-1, newY-1) ){
                game.setPiece(p, newX-1, newY-1);
                break;
            }
        }
    }
    private boolean validPos(int x, int y){
        return (x < 1 || x > game.getHeight()) || (y < 1 || y > game.getWidth());
    }
}
