package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Window {
	public Window(Graphics g, Point pointA, Color color, int width, int height) {
		Box windowBase = new Box(pointA, color, width, height);
		Line horizontal = new Line(new Point((int)(pointA.getX()), (int)((pointA.getY() + height/2))), new Point((int)(pointA.getX() + width), (int)(((pointA.getY() + height/2)))), Color.BLACK, 5);
		Line vertical = new Line(new Point((int)(pointA.getX() + width/2), (int)((pointA.getY()))), new Point((int)(pointA.getX() + width/2), (int)(((pointA.getY() + height)))), Color.BLACK, 5);
		windowBase.draw(g);
		horizontal.draw(g);
		vertical.draw(g);
	}
	
		//constructor for round window
	public Window(Graphics g, Point pointA, Point pointB, Color color, int width, int height) {
		Oval windowBase = new Oval(pointA, pointB, color, width, height);
		Line horizontal = new Line(new Point((int)(pointA.getX()), (int)((pointA.getY() + height/2))), new Point((int)(pointA.getX() + width), (int)(((pointA.getY() + height/2)))), Color.BLACK, 5);
		Line vertical = new Line(new Point((int)(pointA.getX() + width/2), (int)((pointA.getY()))), new Point((int)(pointA.getX() + width/2), (int)(((pointA.getY() + height)))), Color.BLACK, 5);
		windowBase.draw(g);
		horizontal.draw(g);
		vertical.draw(g);
	}
}
