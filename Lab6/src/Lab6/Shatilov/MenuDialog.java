package Lab6.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;

    public MenuDialog() {
        setTitle("Меню лабораторной работы №6");
        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        setMinimumSize(new Dimension(300, 80));
        setModal(true);
        pack();
        setVisible(true);
    }

    private void onOK() {
        dispose();
        switch (comboBox1.getSelectedIndex()){
            case 0:{
                new Task1();
                break;
            }
            case 1:{
                new Task2();
                break;
            }
            case 2:{
                new Task3();
                break;
            }
        }
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        new MenuDialog();
    }
}
