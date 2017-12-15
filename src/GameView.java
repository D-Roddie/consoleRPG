import java.util.Scanner;

public class GameView {

    private String output;
    Scanner sc = new Scanner(System.in);

    public void printGameDialog(String dialog){
        System.out.println(dialog);
    }
    public String getUserInput(){
        return sc.nextLine();
    }
}
