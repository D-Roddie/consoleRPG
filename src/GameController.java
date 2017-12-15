public class GameController {

    private Game model;
    private GameView view;

    public GameController(Game model, GameView view){
        this.model = model;
        this.view = view;
    }

    public void takeGameTurn(){
        model.resetGameDialog();
        view.printGameDialog(model.getGameOptions());
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
