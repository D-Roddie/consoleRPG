import java.util.Random;

public class DarkForrest extends Location{

    Random rand = new Random();
    private int n;

    public DarkForrest(){
        super("Dark Forrest", "in the dark forrest", "1. Go back to the tavern\n2. Search for the lost treasure");
    }
    public void doAction(String input, Player player, Game game){

        switch (input) {
            case "1":
                game.setLocation(new Tavern());
                break;
            case "2":
                System.out.println("*Rolls dice");
                n = rand.nextInt(5);
                if (n == 0){
                    System.out.println("Found the secret treasure!");
                    pickTreasure();
                    game.setHasWon();
                }else{
                    System.out.println("Found nothing, player was attacked by a forrest troll");
                    Troll troll = new Troll();
                    Combat fight = new Combat(player, troll);
            }
            break;
        }
    }
    private void pickTreasure(){
        n = rand.nextInt(5);
        switch (n){
            case 0:
                System.out.println("It's a magic sword!");
                break;
            case 1:
                System.out.println("It's a used sock, just what you needed!");
                break;
            case 2:
                System.out.println("It's a slightly used walking stick, how nice!");
                break;
            case 3:
                System.out.println("It's a brand new Honda!");
                break;
            case 4:
                System.out.println("It's a ERROR 404 Treasure not found");
                break;
            default:
                System.out.println("It's an Error!");
        }
    }
}
