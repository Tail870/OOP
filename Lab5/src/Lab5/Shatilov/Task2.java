package Lab5.Shatilov;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task2 extends JFrame {
    private JPanel rootPanel;
    private JButton назадButton;
    private ImagePanel imagePanel;

    public Task2() {

        назадButton.addActionListener(e -> {
            dispose();
            new MenuDialog();
        });

        setTitle("Задание 2");
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
        private BufferedImage image;

        public ImagePanel() {
            try {
            File file = new File(Main.arg);
            if (file.exists())
                    image = ImageIO.read(new File(Main.arg));
                } catch (Exception e) {
                try {
                    image = ImageIO.read(new File (fileDialog()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                    dispose();
                    new MenuDialog();
                }
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
            try {
                return new Dimension(image.getWidth(), image.getHeight());
            } catch (Exception e) {
                return new Dimension(0,0);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null)
                g.drawImage(image, (getWidth()-image.getWidth())/2, (getHeight()-image.getHeight())/2, this);
        }

    }
}