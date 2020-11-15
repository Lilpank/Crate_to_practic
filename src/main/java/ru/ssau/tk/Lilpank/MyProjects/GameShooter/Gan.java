package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;

public class Gan extends Player {
    public Gan(int x, int y, ID id, Handler handler) {
        super(x, y, id, handler);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x + 12, y, 8, 12);
    }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }
}
