package ru.ssau.tk.Lilpank.MyProjects.GameShooter;


import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Window extends Canvas implements Serializable {
    private static final long serialVersionUID = -3601386784933531974L;

    public Window(int weight, int height, String title, Game game){
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(weight,height));
        frame.setMaximumSize(new Dimension(weight,height));
        frame.setMinimumSize(new Dimension(weight,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();

    }
}
