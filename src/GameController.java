public class GameController {

    private Game model;
    private GameView view;

    public GameController(Game model, GameView view){
        this.model = model;
        this.view = view;
    }

    public void takeGameTurn(){
        //Clears the Dialog string
        model.resetGameDialog();

        //fetches the players current options and prints them
        view.printGameDialog(model.getGameOptions());

        //performs action and prints the result
        model.takeTurn(view.getUserInput());
        view.printGameDialog(model.getGameDialog());


    }

    public void updateView(){
        view.printGameDialog(model.getGameDialog());
    }

    public boolean gameIsActive(){
        return model.isActive();
    }
}