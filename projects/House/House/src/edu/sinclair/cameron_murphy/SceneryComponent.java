package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class SceneryComponent extends JComponent {
		//paint ground
	public void paintComponent(Graphics g) {
			//paint ground
		g.setColor(new Color(7, 118, 58));
		g.fillRect(0, 700, 1000, 300);
			//paint sky
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 1000, 700);
			//tree1
		drawTree(g, 200, 600, 200);
			//polygon test
		//g.drawPolygon(new int[] {0,100,200}, new int[] {200,0,200});
		
	}
	
		//draw tree
	void drawTree(Graphics g, int xLeft, int yTop, int width) {
			//trunk
		g.setColor(new Color(118, 115, 7));
		g.fillRect(xLeft, yTop, width/4, width/2);
			//bottomTriangle
		g.setColor(new Color(7, 118, 60));
		isoTriangle(g, new int[] {xLeft},200,50);
	}
	
	void isoTriangle(Graphics g, int[] leftPoint, int base, int area) {
		int height = 2*(area/base);
		int perimeter = 2*(area + base);
		int[] xInts = {leftPoint[0],leftPoint[0] + (base/2), leftPoint[0]+base};
		int [] yInts = {leftPoint[1],height, leftPoint[1]};
		g.drawPolygon(xInts, yInts, 3);
	}
}
