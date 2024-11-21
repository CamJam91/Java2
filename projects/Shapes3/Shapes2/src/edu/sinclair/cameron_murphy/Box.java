package edu.sinclair.cameron_murphy;

import java.awt.*;

public class Box extends Shape {

	final int POINTS = 4;
	Point p3;
	Point p4;
	
    public Box() {
    }

    /**
     * A shape with 2 points is created, they are diagonal, two new fields are added, p3 and p4
     * note that since p1 and p2 are diagonal, the square points in clockwise order are p1,p2,p3,p4
     * @param p1
     * @param p2
     * @param c
     */
    public Box(Point p1, Point p2, Color c) {
        super(p1, p2, c);
        p3 = new Point((int)(super.getP2().getX()), (int)(super.getP1().getY()));
        p4 = new Point((int)(super.getP1().getX()), (int)(super.getP2().getY()));
    }
    
    //setters
    public void setP3(){
        p3 = new Point((int)(super.getP2().getX()), (int)(super.getP1().getY()));
    }
    public void setP4() {
        p4 = new Point((int)(super.getP1().getX()), (int)(super.getP2().getY()));
    }

    /**
     * draw polygon is used to create the box
     */
    @Override
    public void draw(Graphics g) {
    	Graphics2D g2 = (Graphics2D)g;
    	g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.drawPolygon(new int [] {(int)(super.getP1().getX()), (int)(p3.getX()), (int)(super.getP2().getX()), (int)(p4.getX())}, 
        		new int[] {(int)(super.getP1().getY()),  (int)(p3.getY()), (int)(super.getP2().getY()), (int)(p4.getY())}, POINTS);
    }
    
    /**
     * Because parent shapes set p2 is useful in line but two more points need to be set in box, we override setP2 and leave component code alone
     */
    @Override
    public void setP2(Point p) {
    	super.setP2(p);
    	setP3();
    	setP4();
    }
}