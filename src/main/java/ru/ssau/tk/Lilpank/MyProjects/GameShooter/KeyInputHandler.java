package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputHandler extends KeyAdapter {
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private static int x = 0;
    private static int y = 0;

    public void keyPressed(KeyEvent e) { //клавиша нажата
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
    }

    public void keyReleased(KeyEvent e) { //клавиша отпущена
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
    }

    public void update(long delta) {
        if (leftPressed == true) {
            x--;
        }
        if (rightPressed == true) {
            x++;
        }
    }
}