package Lab5.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.imageio.ImageIO;

public class Task1 extends JFrame {
    private JPanel rootPanel;
    private JButton назадButton;

    public Task1() {

        назадButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        setTitle("Задание 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        rootPanel.setMinimumSize(new Dimension(rootPanel.getWidth(), rootPanel.getHeight() + назадButton.getHeight()));
        rootPanel.add(назадButton, BorderLayout.SOUTH);
        getRootPane().setDefaultButton(назадButton);
        setContentPane(rootPanel);
        pack();
        setVisible(true);
    }
}