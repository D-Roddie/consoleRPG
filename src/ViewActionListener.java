import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewActionListener implements ActionListener{

    private GameController controller;
    private JTextField input;

    public ViewActionListener(JTextField input){
        this.input = input;
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        controller.takeGameTurn(input.getText());
    }
}