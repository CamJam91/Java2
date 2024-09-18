/*
 * Cameron Murphy
 * Shape
 * 9/7/2024
 * CIS 2217 R01
 * Tester for shape classes
 */
package edu.sinclar.cameron_murphy;
import java.awt.Point;

public class Line extends Shape {
	private Shape shape; //the shape of this line
	//constructors
	/**
	 * null value constructor
	 */
	public Line() {
		shape = new Shape();
	}
	/**
	 * arg constructor
	 * @param pointA
	 * @param pointB
	 * @param color
	 */
	public Line(Point pointA, Point pointB, String color) {
		shape = new Shape(pointA, pointB, color);
	}
	//getters
	/**
	 * custom toString() calls super toString()
	 */
	public String toString() {
		double line =  shape.getLineLength();
		return "Line with length: " + String.valueOf(line) + shape; 
		
	}
}