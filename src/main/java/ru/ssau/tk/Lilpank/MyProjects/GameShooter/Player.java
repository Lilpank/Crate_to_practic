package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

public class Player extends GameObject {
    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);
        g.setColor(Color.green);
        g.fillRect(x+12,y,8,12);
    }
}
