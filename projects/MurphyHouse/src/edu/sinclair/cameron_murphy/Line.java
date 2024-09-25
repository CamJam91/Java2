package edu.sinclair.cameron_murphy;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends Shape {
	private float lineWidth;
		//constructors
	public Line(Point pointA, Point pointB, Color color, float lineWidth) {
			//call abstract constructor
		super(pointA, pointB, color);
		this.lineWidth = lineWidth;
	}
	public float getLineWidth() {
		return this.lineWidth;
	}
	
	@Override
	public void draw(Graphics g) {
		//cast g to 2d object and set params
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(getLineWidth()));
		g2.setColor(getColor());
		g2.drawLine((int)getPoint('A').getX(),(int)getPoint('A').getY() , (int)getPoint('B').getX(), (int)getPoint('B').getY()); //get each x and y and cast to an int
	}

	
}