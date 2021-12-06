package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame draw = new JFrame("Drawing");
                DrawingCanvas canvas = new DrawingCanvas();
                LoginFrame frame = new LoginFrame();
                frame.setSize(440,462);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                canvas.setFocusable(true);
                canvas.addKeyListener(new Key(canvas));
                draw.getContentPane().add(canvas);
                draw.setBackground(Color.WHITE);
                draw.setSize(500,500);
                draw.setVisible(true);
                draw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}
