public class consoleRPG {

    public static void main(String[] args){

        Game model = new Game();
        GameView view = new GameView();

        GameController controller = new GameController(model, view);

        do{
            controller.takeGameTurn();

        }while(controller.gameIsActive());
    }
}