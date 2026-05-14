package pieces;

import manage.GameManager;

public abstract class Piece {
    protected int x;
    protected int y;
    protected Color color;
    protected char representation;
    protected GameManager game;

    public Piece(int x, int y, Color color, char rep, GameManager game){
        this.x = x;
        this.y = y;
        this.color = color;
        this.representation = rep;
        this.game = game;
    }

    //getters and setters
    public char getRep(){
        return representation;
    }
    public Color getColor(){
        return color;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public abstract boolean canMove(int x, int y);
}
