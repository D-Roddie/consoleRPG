import java.util.Scanner;

public class GameView {

    Scanner sc = new Scanner(System.in);

    public void printGameDialog(String dialog){
        System.out.println(dialog);
    }

    public void printPlayerHealth(int health){
        System.out.println("player health: " + health);
    }

    public String getUserInput(){
        return sc.nextLine();
    }
}
