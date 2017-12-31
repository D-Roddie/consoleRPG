import javax.swing.text.View;

public class GameController {

    private GameModel model;
    private GameView view;
    private ViewActionListener listener;

    public GameController(GameModel model, GameView view){
        this.model = model;
        this.view = view;
        this.listener = view.listener;
        listener.controller = this;

        updateView();
    }

    public void takeGameTurn(String input){

        model.setDialog("");
        model.takeTurn(input);
        view.printGameDialog(model.getDialog() + model.getGameOptions());

    }

    public void updateView(){
        view.printGameDialog(model.getDialog() + model.getGameOptions());
        model.setDialog("");
    }

    public boolean gameIsActive(){
        return model.getGameIsActive();
    }
}