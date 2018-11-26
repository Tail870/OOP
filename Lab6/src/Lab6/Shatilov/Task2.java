package Lab6.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Task2 extends JFrame {
    private JButton backButton;
    private JLabel westLabel, northLabel, eastLabel, southLabel, centerLabel;
    private JPanel rootPanel, mainPanel;

    public Task2(){
        backButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        westLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null, "WEST", "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        northLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null, "NORTH", "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        eastLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null, "EAST", "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        southLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null, "SOUTH", "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        centerLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null, "CENTER", "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setTitle("Задание 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        rootPanel.setSize(new Dimension(400, 400+backButton.getHeight()));
        getRootPane().setDefaultButton(backButton);
        setContentPane(rootPanel);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
