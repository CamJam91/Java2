/*
 * Cameron Murphy CIS 2217 R01
 * Class for creating Trees
 */
package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Tree {
		//Tree creates a box for the stump and several triangles that are based on its position
	private Point pointB = new Point();
	private Point pointC = new Point();
	public Tree(Graphics g, Point pointA) {
		pointB.setLocation(pointA.getX()-50,pointA.getY());
		pointC.setLocation(pointA.getX()+100,pointA.getY());
		Box stump = new Box(pointA, new Color(74, 42, 1),50,75);
		stump.draw(g);
		
			// each triangles location is reset by adding some points to x and y and then redrawn
		Triangle bottom = new Triangle(pointB,pointC, new Color(0,255,0), 50);
		bottom.draw(g);
		pointB.setLocation(pointB.getX()+7,pointB.getY()-30);
		pointC.setLocation(pointC.getX()-7,pointC.getY()-30);
		Triangle middle = new Triangle(pointB,pointC, new Color(0,255,0), 50);
		middle.draw(g);
		pointB.setLocation(pointB.getX()+7,pointB.getY()-30);
		pointC.setLocation(pointC.getX()-7,pointC.getY()-30);
		middle = new Triangle(pointB,pointC, new Color(0,255,0), 50);
		middle.draw(g);
		pointB.setLocation(pointB.getX()+7,pointB.getY()-30);
		pointC.setLocation(pointC.getX()-7,pointC.getY()-30);
		middle = new Triangle(pointB,pointC, new Color(0,255,0), 50);
		middle.draw(g);
	}
}
