public class DarkForrest extends Location{
    public DarkForrest(){
        super("Dark Forrest", "in the dark forrest", "1. Go back to the tavern\n2. Search for the lost treasure");
    }
    public void doAction(String input, Player player, Game game){
        if (input.equals("1")){
            game.setLocation(new Tavern());
        }
        else if(input.equals("2")){

        }
    }
}
