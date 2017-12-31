import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class ViewActionListener implements ActionListener{

    GameController controller;
    JTextField input;

    public ViewActionListener(JTextField input){
        this.input = input;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        controller.takeGameTurn(input.getText());
    }
}