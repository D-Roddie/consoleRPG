public class GameModel {

    private Player player;
    private Location location;
    private String dialog;
    private boolean hasWon = false;

    public GameModel(Player player, Location location){
        this.player = player;
        this.location = location;
        this.dialog = "";

    }
    public String getGameOptions(){
        return "Player Health: " +
                player.getHealth() + "\n" +
                location.getDescription() +
                "\nWhat are the player going to do?\n" +
                location.getActions();}

    public String getDialog() {
        return dialog;
    }

    public boolean getGameIsActive(){
        if(!hasWon && player.isAlive()){
            return true;
        }else {
            return false;
        }
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public void setHasWon(){hasWon = true;};

    public void takeTurn(String input){
        location.doAction(input, player, this);

    }

    public void appendToDialog(String dialog){
        this.dialog = this.dialog.concat(dialog + "\n");
    }
    public void setDialog(String input){
        this.dialog = input;
    }
}