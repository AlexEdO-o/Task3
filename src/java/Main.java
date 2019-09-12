import model.Game;
import view.MainFrame;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(8);
        MainFrame mainFrame = new MainFrame(8);
        mainFrame.setField(game.getField().getField());
    }

}
