/*
 * Cameron Murphy
 * Shape
 * 9/7/2024
 * CIS 2217 R01
 * Tester for shape classes
 */
package edu.sinclar.cameron_murphy;
import java.awt.Point;


public class Tester {
	public static void main(String[] args) {
	//shape test
	Point pointA = new Point(10,12);
	Point pointB = new Point(14,20);
	Shape testShape = new Shape(pointA, pointB,"Red");
	System.out.println(testShape);
	
	//line test
	Line testLine = new Line(pointA, pointB, "Blue");
	System.out.println(testLine);
	
	//box test
	Box testBox = new Box(pointA, pointB,"Green",5);
	System.out.println(testBox);
	
	//oval test
	Oval testOval = new Oval(pointA, pointB, "Purple",.5);
	System.out.println(testOval);
	}
	
}
