package edu.sinclair.cameron_murphy;

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable{
    private Color myColor;
    private Point p1, p2;
    private int lineWidth = 2;

    public Shape() {
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
        myColor = Color.BLACK;
    }

    public Shape(Point p1, Point p2, Color c) {
        setP1(p1);
        setP2(p2);
        setColor(c);
    }

    public void setP1(Point p) {
        p1 = p;
    }

    public void setP2(Point p) {
        p2 = p;
    }

    public void setColor(Color c) {
        this.myColor = c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Color getColor() {
        return myColor;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int width) {
        lineWidth = width;
    }

    public abstract void draw(Graphics g);
}
