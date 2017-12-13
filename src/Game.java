import java.util.Scanner;


public class Game {

    private Player player = new Player(100, 25, 10);
    private Location location = new Tavern();

    String input;

    Scanner sc = new Scanner(System.in);

    public Game(){
        do{
            System.out.println("The player finds himself " + location.getDescription() + ". What will he do now?");
            System.out.println(location.getActions());

            input = sc.nextLine();
            location.doAction(input, player, this);

        }while(player.isAlive());

    }

    public void setLocation(Location location){
        this.location = location;
    }
}