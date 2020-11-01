package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    // 1 - up, 2 - down, 3 - left, 4 - right
    int direction = 1;

    int x = 256;
    int y = 256;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Games");// создаем окно с названием
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// закрытие окна при клике крестика
        frame.setSize(1800, 1000); // размер окна
        frame.getContentPane().add(new Main());
        frame.setLocation(60, 0);
        frame.setVisible(true); // окно видимо
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, 64, 64);

        int width = 20;
        int height = 24;
        g.setColor(Color.GREEN);
        switch (direction) {
            case (1): {
                g.fillRect(x + 22, y, width, height);
                break;
            }
            case (2): {
                g.fillRect(x + 22, y + 40, width, height);
                break;
            }
            case (3): {
                g.fillRect(x, y + 22, height, width);
                break;
            }
            case (4): {
                g.fillRect(x + 40, y + 22, height, width);
                break;
            }
        }
    }
}