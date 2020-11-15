package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

public class BasicEnemyX extends GameObject {
    int count = 0;

    public BasicEnemyX(int x, int y, ID id) {
        super(x + 30, y + 10, id);
            velX += 5;
    }

    public BasicEnemyX(int x, int y) {
        super(x - 20, y + 10, ID.BasicEnemy);
            velX -= 5;
    }

    @Override
    public void tick() {
        x += velX;
        if (y <= 0 || y >= Game.HEIGHT - 55) {
            velY *= -1;
            count++;
        }
        if (x <= 0 || x >= Game.WIDTH - 40) {
            velX *= -1;
            count++;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);

    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }
}
