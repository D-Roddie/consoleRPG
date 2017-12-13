import java.util.Scanner;


public class Game {

    Player player = new Player(100, 25, 10);
    Location location = new Tavern();

    String input;

    Scanner sc = new Scanner(System.in);

    public Game(){
        do{
            System.out.println("The player finds himself in a nice little tavern. What will he do now?");
            System.out.println(location.getActions());

            input = sc.nextLine();
            location.doAction(input, player);

        }while(player.isAlive());

    }
}