package Lab6.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Task1 extends JFrame {
    private JPanel rootPanel;
    private JTextField textField1;
    private JButton backButton, quessButton;
    private JLabel nameLabel, quessResultLabel, rulesLabel1, rulesLabel2, rulesLabel3, rulesLabel4, rulesLabel5;
    private int r = new Random(System.currentTimeMillis()).nextInt(21);
    private int t = 0;

    public Task1() {
        backButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        quessButton.addActionListener(e -> {
            if (!textField1.getText().equals("")) {
                if (Integer.parseInt(textField1.getText()) != r) {
                    if (Integer.parseInt(textField1.getText()) < r) {
                        quessResultLabel.setText("Ваше число меньше!");
                        t++;
                    }
                    else {
                        quessResultLabel.setText("Ваше число больше!");
                        t++;
                    }
                } else{
                    quessResultLabel.setText("Вы угадали!");
                    JOptionPane.showMessageDialog(null, "Вы победили!", "Результат", JOptionPane.INFORMATION_MESSAGE);
                    onExit();
                }
            }
            else
                quessResultLabel.setText("Введите число.");
            if (t>=3) {
                JOptionPane.showMessageDialog(null, "Вы проиграли! Загаданное число: "+r, "Результат", JOptionPane.INFORMATION_MESSAGE);
                onExit();
            }
        });

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!Character.isDigit(e.getKeyChar()))
                    e.consume();
            }
        });

        setTitle("Задание 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        rootPanel.setMinimumSize(new Dimension(400,320));
        setResizable(false);
        getRootPane().setDefaultButton(quessButton);
        setContentPane(rootPanel);
        pack();
        setVisible(true);
    }
    private void onExit(){
        dispose();
        new MenuDialog();
    }
}
