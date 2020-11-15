package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

import static ru.ssau.tk.Lilpank.MyProjects.GameShooter.KeyInput.shoot;

public class BasicEnemyY extends GameObject {
    int count = 0;

    public BasicEnemyY(int x, int y, ID id) {
        super(x + 10, y - 20, id);
            velY -= 5;

    }

    public BasicEnemyY(int x, int y) {
        super(x + 10, y + 40, ID.BasicEnemy);
            velY += 5;

    }

    @Override
    public void tick() {
        y += velY;
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

