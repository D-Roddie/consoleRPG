import java.util.Scanner;


public class Game {

    //Initializes the game
    private Player player = new Player(40, 25, 10);
    private Location location = new Tavern();
    private boolean hasWon = false;

    String input;

    Scanner sc = new Scanner(System.in);

    //Game Loop
    public Game(){
        do{
            System.out.println("\nThe player finds himself " + location.getDescription() + ". What will he do now?");
            if(player.getHealth() > 10){
                System.out.println("Player health "+ player.getHealth());
            }else{System.out.println("Player health " + player.getHealth() + "(you should go get more beer)");}

            System.out.println(location.getActions());

            //takes player input and performs action
            input = sc.nextLine();
            System.out.println("_____________________");
            location.doAction(input, player, this);

        }while(player.isAlive() && !hasWon);

    }


    //Setters Getters
    public boolean hasWon(){ return hasWon; }

    public void setLocation(Location location){ this.location = location; }

    public void setHasWon(){ hasWon = true; }
}