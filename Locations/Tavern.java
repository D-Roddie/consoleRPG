public class Tavern extends Location{
    public Tavern(){
        super("Tavern", "The player finds himself in a tavern",
                "1 Have a beer\n2 Brawl with other drunks\n3 Go outside");
    }
    public void doAction(String input, Player player, GameModel game){

        switch(input){
            case "1":
                game.appendToDialog("*FeelsGoodMan*\nFull health restored");
                player.heal();
                break;
            case "2":
                Drunk drunk = new Drunk();
                Combat fight = new Combat(player, drunk, game);
                break;
            case "3":
                game.setLocation(new Outside());
                break;
        }
    }
}