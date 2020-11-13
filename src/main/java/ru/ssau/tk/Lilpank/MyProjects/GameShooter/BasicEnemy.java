package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;


public class BasicEnemy extends GameObject {
    int count = 0;
    private Handler handler;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        velX = 5;
        velY = 5;
        this.handler = handler;
    }


    @Override
    public void tick() {
        x += velX;
        y += velY;
        //пускай пулька делает 3 отскока.
        if (count == 3) {
            handler.clearEnemy();
        }
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
