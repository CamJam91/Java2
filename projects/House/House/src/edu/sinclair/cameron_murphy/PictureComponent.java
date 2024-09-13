package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class PictureComponent extends JComponent {
	public void paintComponent(Graphics g) {
		drawScenery(g);
		drawHouse(g);
	}
	
	public void drawScenery(Graphics g) {
		Box ground = new Box(new Point(0,650), new Color(6, 214, 76), 1000,650);
		ground.draw(g);
		Box sky = new Box(new Point(0,0), new Color(102, 181, 237),1000,650);
		sky.draw(g);
	}
	public void drawHouse(Graphics g) {
		Point housePoint = new Point(300,375);
		int houseWidth = 500;
		int houseHeight = 300;
		int heightConstraint = (int)housePoint.getY() + houseHeight;
		int widthConstraint = (int)housePoint.getX() + houseWidth;
		Box houseBase = new Box(housePoint, new Color(112, 65, 11),houseWidth, houseHeight);
		houseBase.draw(g);
		windowBox(g, new Point((int)(housePoint.getX() + (houseWidth*.1)), (int)(housePoint.getY()+(houseHeight*.1))), new Color(255,255,255), (int)(heightConstraint*.125),(int)(heightConstraint*.125));
		windowBox(g, new Point((int)(housePoint.getX()+(houseWidth*.85)),(int)(housePoint.getY()+(houseHeight*.2))), new Color(255,255,255),50,50);
		//windowBox(g, new Point(houseBase.getPoint('A').getX()+(int)(houseBase.getWidth()*1),(int)(houseBase.getHeight()*1)), new Color(255,255,255),80,80);
//		windowBox(g, new Point(350,450), new Color(255,255,255),80,80);
//		windowBox(g, new Point(675,450), new Color(255,255,255),80,80);
		
	}

	public void windowBox(Graphics g, Point pointA, Color color, int width, int height){
			Box windowFrame = new Box(pointA, color, height, width);
			windowFrame.draw(g);
			//draws line using calculation LinePointAx = ParameterPointA + Width/2, LinePointAy = ParameterPointAy + height, LinePointAy = same but no added height
			Line vertical = new Line(new Point((int)(pointA.getX() + width/2),(int)pointA.getY()+height), new Point((int)(pointA.getX() + width/2), (int)pointA.getY()),new Color(0,0,0),5);
			vertical.draw(g);
			Line horizontal = new Line(new Point((int)(pointA.getX()),(int)pointA.getY() + height/2), new Point((int)(pointA.getX()+width),(int)pointA.getY() + height/2),new Color(0,0,0),5);
			horizontal.draw(g);
	}
}
