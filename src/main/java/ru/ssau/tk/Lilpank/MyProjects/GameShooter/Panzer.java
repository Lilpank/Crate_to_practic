package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import javax.swing.*;
import java.awt.*;

public class Panzer extends JPanel {
    private static int x = 256;
    private int y = 256;

    Panzer(){
    }

    //рисуется танк в этом методе.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);

        g.fillRect(x, y, 64, 64);

        g.setColor(Color.GREEN);
        // 1 - up, 2 - down, 3 - left, 4 - right
        int direction = 1;
        int width = 20;
        int height = 24;
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
