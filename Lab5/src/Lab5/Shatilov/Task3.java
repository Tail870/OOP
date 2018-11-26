package Lab5.Shatilov;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Task3 extends JFrame {
    public static String arg = Main.arg;
    private JPanel rootPanel;
    private JButton назадButton;
    private ImagePanel imagePanel;

    public Task3() {

        назадButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        setTitle("Задание 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        imagePanel = new ImagePanel();
        rootPanel.add(imagePanel);
        rootPanel.setMinimumSize(new Dimension(rootPanel.getWidth(), rootPanel.getHeight()+назадButton.getHeight()));
        rootPanel.add(назадButton, BorderLayout.SOUTH);
        getRootPane().setDefaultButton(назадButton);
        setContentPane(rootPanel);
        pack();
        setVisible(true);
    }

    class ImagePanel extends JPanel{
        private Image image;

        public ImagePanel() {
            try {
                File file = new File(Main.arg);
                if (file.exists())
                    image = new ImageIcon(Main.arg).getImage();
            } catch(Exception e) {
                image = new ImageIcon(fileDialog()).getImage();
            }
        }
        private String fileDialog(){
            FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
            dialog.setMode(FileDialog.LOAD);
            dialog.setVisible(true);
            return dialog.getDirectory()+dialog.getFile();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(image.getWidth(this), image.getHeight(this));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null)
                g.drawImage(image, (getWidth()-image.getWidth(this))/2, (getHeight()-image.getHeight(this))/2, this);
        }

    }
}