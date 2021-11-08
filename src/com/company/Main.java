package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                LoginFrame frame = new LoginFrame();
                frame.setSize(440,440);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }
}
