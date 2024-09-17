package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

abstract public class Shape {
	private Point pointA;
	private Point pointB;
	private Color color;
	
		//constructors
		/**
		 * arg constructor
		 * @param pointA
		 * @param pointB
		 * @param color
		 * @param stroke
		 */
	public Shape(Point pointA, Point pointB, Color color){
		this.pointA = pointA;
		this.pointB = pointB;
		this.color = color;
	}
	
	//getters
	/**
	 * gets either point A or B
	 * @param point
	 * @return
	 */
	public Point getPoint(char point) {
		if (point == 'A')
			return pointA;
		else
			return pointB;
	}
	public Color getColor() {
		return color;
	}
	public abstract void draw(Graphics g); // draw child shape
}
