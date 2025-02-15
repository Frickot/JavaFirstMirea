package ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

    /*
    Создайте окно, реализуйте анимацию с помощью картинки, состоящей из нескольких кадров.
     */

public class Task5_3 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("window");
        frame.setVisible(true);
        frame.setSize(new Dimension(100, 100));
        String imagePath = "/Users/CheloveckPuding/IdeaProjects/JavaFirstMirea/out/production/JavaFirstMirea/ru/mirea/task5/Resources/img1.gif";
        String imagePath2 = "/Users/CheloveckPuding/IdeaProjects/JavaFirstMirea/out/production/JavaFirstMirea/ru/mirea/task5/Resources/img2.gif";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));
        BufferedImage myPicture2 = ImageIO.read(new File(imagePath2));

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
        JPanel jPanel = new JPanel();

        frame.add(jPanel);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (random.nextBoolean()) {
                    jPanel.add(picLabel2);
                } else{
                    jPanel.add(picLabel);
                }
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        }, 0, 250);

    }
}