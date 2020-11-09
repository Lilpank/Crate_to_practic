package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

public class Player extends GameObject {
    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g) {
        if(id == ID.Player){
        g.setColor(Color.white);}
        else if(id == ID.Player2){
            g.setColor(Color.blue);
        }
        g.fillRect(x, y, 32, 32);
        g.setColor(Color.green);
        g.fillRect(x + 12, y, 8, 12);
    }
}
