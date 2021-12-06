package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Key implements KeyListener {


    public  DrawingCanvas canvas;

    public Key(DrawingCanvas canvas)
    {
        this.canvas= canvas;
    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar()=='k') {
            canvas.changePlaceOfSquare();
            canvas.squareColor = Color.BLACK;
        }
        if(e.getKeyChar()=='o') {
            canvas.changePlaceOfOval();
            canvas.ovalColor = Color.BLACK;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}
