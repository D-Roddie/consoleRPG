public class consoleRPG {

    public static void main(String[] args){

        GameModel model = new GameModel(new Player(40, 25, 10,
                new Stick(), new WoolHat()),
                new Tavern());

        GameView view = new GameView();

        GameController controller = new GameController(model, view);
    }
}