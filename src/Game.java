import java.util.Scanner;


public class Game {

    Player player = new Player(100, 25, 10);

    Scanner sc = new Scanner(System.in);

    public Game(){
        do{
            System.out.println("The player finds himself in a nice little tavern. What will he do now?");
            sc.nextLine();

        }while(player.isAlive());

    }
}
