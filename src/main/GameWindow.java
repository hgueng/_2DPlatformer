package main;

import javax.swing.*;

public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel){

        jframe = new JFrame();

        jframe.setSize(400,400);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit when clicking on  close button
        jframe.add(gamePanel);
        jframe.setVisible(true); //makes the frame visible when set to true


    }

}
