package Lab6.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;

public class Task3 extends JFrame{
    private JPanel rootPanel;
    private JButton backButton;
    private JEditorPane editorPane1;
    private JComboBox comboBoxColor;
    private JComboBox comboBoxFont;

    Task3() {
        backButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        setTitle("Задание 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(backButton);
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        editorPane1.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        comboBoxFont.addItemListener(e -> {
            switch (comboBoxFont.getSelectedIndex()) {
                case 0: {  //Times New Roman
                    editorPane1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                    break;
                }
                case 1: {  //MS Sans Serif
                    editorPane1.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                    break;
                }
                case 2: {  //Courier New
                    editorPane1.setFont(new Font("Courier New", Font.PLAIN, 14));
                    break;
                }
            }
        });

        comboBoxColor.addItemListener(e -> {
            switch (comboBoxColor.getSelectedIndex()) {
                case 0: {  //Black
                    editorPane1.setForeground(Color.black);
                    break;
                }
                case 1: {  //Blue
                    editorPane1.setForeground(Color.blue);
                    break;
                }
                case 2: {  //Red
                    editorPane1.setForeground(Color.red);
                    break;
                }
            }
        });
    }
}