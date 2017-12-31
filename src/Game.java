import java.util.Scanner;

/**
public class Game {

    //Initializes the game
    private Player player = new Player(40, 25, 10,
            new Stick(), new WoolHat());

    private Location location = new Tavern();
    private boolean hasWon = false;
    private String gameDialog;

    public Game(){
        resetGameDialog();
    }

    public void takeTurn(String input){
        location.doAction(input, player, this);
    }

    public void appendToDialog(String string){
        gameDialog = gameDialog.concat("\n" + string);
    }

    public String getGameDialog() {
        return gameDialog;
    }

    public void resetGameDialog(){
        gameDialog = "";
    }

    public String getGameOptions(){
        return "--------\nPlayer Health: " +
                player.getHealth() + "\n" +
                location.getDescription() +
                "\nWhat are the player going to do?\n" +
                location.getActions();
    }

    public boolean isActive(){ return !hasWon; }

    public void setLocation(Location location){ this.location = location; }

    public void setHasWon(){ hasWon = true; }
}
*/