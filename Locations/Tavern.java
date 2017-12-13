public class Tavern extends Location{
    public Tavern(){
        super("Tavern", "it's a tavern", "1 Have a beer\n2 Brawl with other drunks\n3 Go outside");
    }
    public void doAction(String input, Player player){
        if (input.equals("1")){
            drinkBeer();
        }
        else if(input.equals("2")){
            Drunk drunk = new Drunk();
            Combat fight = new Combat(player, drunk);
        }
        else if(input.equals("3")){
        }

    }
    public void drinkBeer(){
        System.out.println("*Drinks beer*\n*FeelsGoodMan.jpg*");
    }
}