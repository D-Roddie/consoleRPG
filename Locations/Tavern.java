public class Tavern extends Location{
    public Tavern(){
        super("Tavern", "in a tavern", "1 Have a beer\n2 Brawl with other drunks\n3 Go outside");
    }
    public void doAction(String input, Player player, Game game){

        switch(input){
            case "1":
                drinkBeer(player);
                break;
            case "2":
                Drunk drunk = new Drunk();
                Combat fight = new Combat(player, drunk);
                break;
            case "3":
                game.setLocation(new Outside());
                break;
        }
    }
    public void drinkBeer(Player player){
        System.out.println("*Drinks beer*\n*FeelsGoodMan.jpg*\nMax health restored");
        player.heal();
    }
}