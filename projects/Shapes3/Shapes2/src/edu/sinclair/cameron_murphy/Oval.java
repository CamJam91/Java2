package edu.sinclair.cameron_murphy;

import java.awt.*;

public class Oval extends Shape {
	int width;
	int height;
	
    public Oval() {
    }

    public Oval(Point p1, Point p2, Color c) {
        super(p1, p2, c);
        width = (int)(super.getP2().getX()-super.getP1().getX());
        height = (int)(super.getP2().getY()-super.getP1().getY());
    }

    @Override
    public void draw(Graphics g) {
    	Graphics2D g2 = (Graphics2D)g;
    	g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.drawOval((int)(super.getP1().getX()), (int)(super.getP1().getY()), width, height);
    }
    /**
     * Because parent shapes set p2 is useful in line but we need width and height, we override setP2 and leave component code alone
     */
    @Override
    public void setP2(Point p) {
    	super.setP2(p);
    	width = (int)(super.getP2().getX()-super.getP1().getX());
        height = (int)(super.getP2().getY()-super.getP1().getY());
    }
}