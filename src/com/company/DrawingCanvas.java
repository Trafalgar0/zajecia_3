package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawingCanvas extends JPanel {

    public Rectangle square= new Rectangle(0,0,50,50);
    public Color squareColor = Color.WHITE;
    public Color ovalColor = Color.WHITE;
    public int x=0;
    public int y=0;

    @Override
    public void paint(Graphics g)
    {
        g.setColor(squareColor);
        g.fillRect(square.x,square.y,square.width,square.height);
        g.setColor(ovalColor);
        g.fillOval(x,y,50,50);
    }

    public void changePlaceOfSquare()
    {
        square.x=getMousePosition().x;
        square.y=getMousePosition().y;
        this.repaint();
    }

    public void changePlaceOfOval()
    {
        x=getMousePosition().x;
        y=getMousePosition().y;
        this.repaint();
    }

}
