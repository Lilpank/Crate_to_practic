package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

public class BasicEnemy extends GameObject {
    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);
        velX = 5;
        velY = 5;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        //Game.HEIGHT - 34 это костыль.
        if (y <= 0 || y >= Game.HEIGHT - 34) {
            velY *= -1;
        }
        if (x <= 0 || x >= Game.WIDTH - 34) {
            velX *= -1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);
    }
}
