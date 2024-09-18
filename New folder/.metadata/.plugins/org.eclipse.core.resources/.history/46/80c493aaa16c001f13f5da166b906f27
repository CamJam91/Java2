package edu.sinclar.cameron_murphy;
import java.awt.Point;

public class Oval extends Shape {
	private double majorAxis; //this is the line that connects the 2 shape points
	private double minorAxis;
	private float eccentricity;
	private Shape shape;
	final double pi = 3.14159;
	
	//constructors
	/**
	 * default constructor with null values
	 */
	public Oval(){
		shape = new Shape();
		majorAxis = 0;
		minorAxis = 0;
	}
	/**
	 * arg constructor, sets eccentricity and axes using 
	 * equation minorAxis = (majorAxis/2)*sqrt(1-eccentriciy^2)
	 * @param pointA
	 * @param pointB
	 * @param color
	 * @param eccentricity
	 */
	public Oval(Point pointA, Point pointB, String color, float eccentricity) {
		shape = new Shape(pointA, pointB, color);
		this.eccentricity = eccentricity;
		majorAxis = shape.getLineLength();
		minorAxis = (majorAxis/2)*Math.sqrt(1-(eccentricity*eccentricity));
	}
	
	//getters
	/**
	 * use axis to return area of oval
	 * @return
	 */
	public double getArea() {
		return pi * majorAxis * minorAxis;
	}
	public float getEccentricity() {
		return eccentricity;
	}
	
	//setters
	/**
	 * sets eccentricity, minorAxis must be recalculated 
	 * @param eccentricity
	 */
	public void setEccentricity(float eccentricity) {
		this.eccentricity = eccentricity;
		minorAxis = (majorAxis/2)*Math.sqrt(1-(eccentricity*eccentricity));
		
	}
	/**
	 * @override of setPoint since both axis need to be recalculated, calls the superclass version of set point
	 * @param majorAxis
	 */
	public void setPoint(Point point, char c) {
		if (c == 'A') {
			super.setPoint(point, c);
			majorAxis = shape.getLineLength();
			minorAxis = (majorAxis/2)*Math.sqrt(1-(eccentricity*eccentricity));
		}
		else if(c == 'B') {
			super.setPoint(point,c);
			majorAxis = shape.getLineLength();
			minorAxis = (majorAxis/2)*Math.sqrt(1-(eccentricity*eccentricity));
		}
		else
			System.out.printf("%s is not a valid point", c);
	}
}
