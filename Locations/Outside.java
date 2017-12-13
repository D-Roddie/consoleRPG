public class Outside extends Location{
    public Outside(){
        super("Outside", "outside of the tavern", "1 Enter the tavern\n2 Enter the dark forrest");
    }
    public void doAction(String input, Player player, Game game){
        switch(input){
            case "1":
                game.setLocation(new Tavern());
                break;
            case "2":
                game.setLocation(new DarkForrest());
                break;
        }
    }
}