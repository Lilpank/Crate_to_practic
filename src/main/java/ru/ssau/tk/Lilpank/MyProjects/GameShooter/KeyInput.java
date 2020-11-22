package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private boolean[] keyDown = new boolean[4];
    static int shoot = 0;

    public KeyInput(Handler handler) {
        this.handler = handler;
        keyDown[0] = false;
        keyDown[1] = false;
        keyDown[2] = false;
        keyDown[3] = false;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_LEFT) {
                    shoot = 1;
                    tempObject.setVelX(-5);
                    keyDown[3] = true;
                }
                if (key == KeyEvent.VK_UP) {
                    shoot = 2;
                    tempObject.setVelY(-5);
                    keyDown[0] = true;
                }
                if (key == KeyEvent.VK_DOWN) {
                    shoot = 3;
                    tempObject.setVelY(5);
                    keyDown[1] = true;
                }
                if (key == KeyEvent.VK_RIGHT) {
                    shoot = 4;
                    tempObject.setVelX(5);
                    keyDown[2] = true;
                }
                if (key == KeyEvent.VK_SPACE) {
                    switch (shoot) {
                        case (1): {
                            handler.addObject(new BasicEnemyX(tempObject.getX(), tempObject.getY()));
                            break;
                        }
                        case (2): {
                            handler.addObject(new BasicEnemyY(tempObject.getX(), tempObject.getY(), ID.BasicEnemy));
                            break;
                        }
                        case (3): {
                            handler.addObject(new BasicEnemyY(tempObject.getX(), tempObject.getY()));
                            break;
                        }
                        case (4): {
                            handler.addObject(new BasicEnemyX(tempObject.getX(), tempObject.getY(), ID.BasicEnemy));
                            break;
                        }
                    }
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_LEFT) {
                    keyDown[3] = false;
                }
                if (key == KeyEvent.VK_UP) {
                    keyDown[0] = false;
                }
                if (key == KeyEvent.VK_DOWN) {
                    keyDown[1] = false;
                }
                if (key == KeyEvent.VK_RIGHT) {
                    keyDown[2] = false;
                }

                if (!keyDown[0] && !keyDown[1]) {
                    tempObject.setVelY(0);
                }
                if (!keyDown[2] && !keyDown[3]) {
                    tempObject.setVelX(0);
                }
            }
        }
    }
}
