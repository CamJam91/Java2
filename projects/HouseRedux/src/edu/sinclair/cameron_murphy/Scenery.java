package edu.sinclair.cameron_murphy;

import java.awt.Graphics;
import java.awt.Point;

public class Scenery {
	public static void draw(Graphics g) {
		Ground.draw(g);
		Sky.draw(g);
		Tree treeLeft = new Tree(g, new Point(100,725));
		Tree treeRight = new Tree (g, new Point(800, 750));
	}
}
