package command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SwingActions extends JFrame {
    private JToolBar toolBar;
    private JTextArea textArea;
    private JMenu menu;
    private Action openAction;
    private Action closeAction;

    public SwingActions() {
        super("Swing Actions");
        setupGUI();
    }

    private void setupGUI() {
        toolBar = new JToolBar();
        menu = new JMenu("File");

        textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.setPreferredSize(new Dimension(450, 150));
        contentPane.add(toolBar, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        setContentPane(contentPane);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

        ImageIcon icon = new ImageIcon("images/icon.png");
        openAction = new AbstractAction("Open", icon) {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Opening from " + e.getActionCommand() + "\n");
            }
        };

        JButton openButton = toolBar.add(openAction);
        openButton.setText("");
        openButton.setActionCommand("Open Button");
        openButton.setToolTipText("This is the Open Button");

        JMenuItem openMenuItem = menu.add(openAction);
        openMenuItem.setIcon(null);
        openMenuItem.setActionCommand("Menu option for Open");
    }
}
