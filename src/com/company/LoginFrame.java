package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class LoginFrame extends JFrame implements ActionListener {




    int x_max=220;
    int y_max=220;
    int x=160;
    int y=160;
    Container container = getContentPane();
    JButton loginButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");

    LoginFrame() {
        this.setVisible(true);
        this.setTitle("Running Button");
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        addMouseEvent();
    }


    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        loginButton.setBounds(x,y,100,30);
        cancelButton.setBounds(300, 300, 100, 30);
    }

    public void addComponentsToContainer() {

        container.add(loginButton);
        container.add(cancelButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public void addMouseEvent() {

        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    Random rand = new Random();
                    y= rand.nextInt(y_max);
                    x= rand.nextInt(x_max);
                    loginButton.setLocation(x,y);
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {

        }

        if (e.getSource() == cancelButton)
        {

        }
        }
    }


