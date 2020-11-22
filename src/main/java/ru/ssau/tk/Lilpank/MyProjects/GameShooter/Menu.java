package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Menu extends MouseAdapter {
    private Game game;
    private Handler handler;
    private Random r = new Random();
    public Menu(Game game, Handler handler){
        this.game = game;
        this.handler = handler;
    }

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        if(mouseOver(mx,my,210,150,200,64)){
            game.gameState = Game.STATE.Game;
            handler.addObject(new Player(Game.WIDTH / 2 - 60, Game.HEIGHT / 2, ID.Player, handler));
        }
    }

    public void mouseReleased(MouseEvent e) {

    }

    private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
        if (mx > x && mx < x + width) {
            if (my > y && my < y + height) {
                return true;
            } else return false;
        } else return false;
    }

    public void tick() {

    }

    public void render(Graphics g) {
        Font fnt = new Font("arial", 1, 50);
        Font fnt1 = new Font("arial", 1, 50);

        g.setFont(fnt);
        g.setColor(Color.white);
        g.drawString("Menu", 240, 70);

        g.setFont(fnt1);
        g.setColor(Color.white);
        g.drawRect(210, 150, 200, 64);
        g.drawString("Play", 260, 200);

        g.setColor(Color.WHITE);
        g.drawRect(210, 250, 200, 64);
        g.drawString("Help", 260, 300);

        g.setColor(Color.WHITE);
        g.drawRect(210, 350, 200, 64);
        g.drawString("Quit", 260, 400);
    }
}
