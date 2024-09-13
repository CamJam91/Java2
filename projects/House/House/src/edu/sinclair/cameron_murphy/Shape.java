/*
 * Cameron Murphy
 * Shape
 * 9/7/2024
 * CIS 2217 R01
 * Shape class for drawing house scene
 */
package edu.sinclair.cameron_murphy;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.Color;
import java.awt.Graphics;

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
	
	//setters
	/**
	 * sets a Point variable to a new Point
	 * @param point
	 * @param c
	 */
	public void setPoint(Point point, char c) {
		if (c == 'A')
			this.pointA = point;
		else if(c == 'B')
			this.pointB = point;
		else
			System.out.printf("%s is not a valid point", c);
	}
	/**
	 * sets the color variable
	 * @param color
	 */
	public void setColor(Color color) {
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
	/**
		* returns the color of this shape
		* @return
	*/
	public Color getColor() {
		return color;
	}
	/**
		*returns distance of opposite points
		* @return
	*/
	public double getDitance() {
		Point pointA = getPoint('A');
		Point pointB = getPoint('B');
		double length = pointA.distance(pointB);
		return length;
	}
	
	
	//methods
	/**
		* stub method for drawing shapes
		* @param g
	*/
	public abstract void draw(Graphics g); // draw child shape
	public abstract double getArea(); //get area
	public String toString() {
		return "Point A: " + pointA + "Point B: " + pointB + "Color: " + color;
	}
}
