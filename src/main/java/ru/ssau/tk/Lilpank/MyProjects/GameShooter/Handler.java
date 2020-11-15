package ru.ssau.tk.Lilpank.MyProjects.GameShooter;

import java.awt.*;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> object = new LinkedList<>();
    LinkedList<Gan> ganObject = new LinkedList<>();

    public void tick() {
        for (int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    public void addObject(GameObject object) {
        this.object.add(object);
    }

    public void removeObject(Gan object) {
        this.ganObject.remove(object);
    }

    public void clearGan() {
        for (int i = 0; i < ganObject.size(); i++) {
            Gan tempGanObject = ganObject.get(i);
            if (tempGanObject.getId() != ID.Player) {
                removeObject(tempGanObject);
            }
        }
    }
}