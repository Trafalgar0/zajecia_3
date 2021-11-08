package com.company;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new JFrame("Logowanie");
                frame.setSize(500,400);
                frame.setVisible(true);
            }
        });

    }
}
