/*
 * Cameron Murphy CIS 2217 R01
 * Class for creating Triangles
 */
package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

	//creates a shape with two points, these are the bottom left and right points, then top is decided by 
//X:halfway between left.x an right.x and Y: height
public class Triangle extends Shape {
	private Point top = new Point();
	
	public Triangle(Point left, Point right, Color color, int height) {
		super(left, right, color);
		top.setLocation((left.getX() + right.getX())/2,left.getY() - height);
	}
	@Override
	public void draw(Graphics g) {
			//create int points then draw and fill polygon
		int [] xPoints = {(int)super.getPoint('A').getX(), (int)super.getPoint('B').getX(),(int)top.getX()};
		int [] yPoints = {(int)super.getPoint('A').getY(), (int)super.getPoint('B').getY(),(int)top.getY()};
		g.setColor(super.getColor());
		g.drawPolygon(xPoints, yPoints, 3);
		g.fillPolygon(xPoints, yPoints, 3);
	}

}
