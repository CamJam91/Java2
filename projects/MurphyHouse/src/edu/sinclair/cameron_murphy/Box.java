package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Box extends Shape {
	int width;
	int height;
	public Box(Point pointA,Color color, int width, int height) {
		super(pointA, new Point(0,0), color); //fill rect only needs one point so pointB is dummy
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void draw (Graphics g) {
		g.setColor(getColor());
		g.fillRect((int)getPoint('A').getX(), (int)getPoint('A').getY(), width, height);
	}

}
