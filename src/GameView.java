import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameView extends JFrame{

    JLabel picturePlaceholder = new JLabel("Picture Placeholder");
    JTextArea dialog = new JTextArea("dialog");
    JTextField input = new JTextField(6);
    ViewActionListener listener = new ViewActionListener(input);
    JButton enter = new JButton("Go");

    public GameView(){
        super("Console RPG");


        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        //adding all the components to the panel
        constraints.gridy = 0;
        constraints.gridx = 0;
        panel.add(picturePlaceholder, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        dialog.setEditable(false);
        panel.add(dialog, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        panel.add(input, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        enter.addActionListener(listener);
        constraints.anchor = GridBagConstraints.EAST;
        panel.add(enter, constraints);

        // adding to frame and setting frame parameters
        frame.add(panel);
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        frame.setVisible(true);

    }

    public void printGameDialog(String dialog){
        this.dialog.setText(dialog);
    }
}