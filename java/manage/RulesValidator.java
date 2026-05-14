package manage;

public class RulesValidator {
    private GameManager game;

    public RulesValidator(GameManager game){
        this.game = game;
    }
    public boolean checkRules(int x, int y){
        if(isOccupied(x, y))
            return false;

        return true;
    }
    private boolean isOccupied(int x, int y){
        //check if any other of your pieces is standing on selected position
        if(game.getPiece(x, y) != null)
            return true;

        return false;
    }
}
