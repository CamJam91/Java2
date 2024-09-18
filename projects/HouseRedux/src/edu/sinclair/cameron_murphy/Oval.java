/*
 * Cameron Murphy CIS 2217 R01
 * Class for creating Ovals
 */
package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape {

	private int width;
	private int height;
	
	public Oval(Point pointA, Point pointB, Color color, int width, int height) {
		super(pointA, pointB, color);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.drawOval((int)(super.getPoint('A').getX()), (int)(super.getPoint('B').getY()), width, height);
		g.fillOval((int)(super.getPoint('A').getX()), (int)(super.getPoint('B').getY()), width, height);
	}

}