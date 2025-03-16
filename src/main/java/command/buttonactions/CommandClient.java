package command.buttonactions;

import javax.swing.*;

public class CommandClient {
    public static void main(String[] args) {
        SwingActions frame = new SwingActions();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
