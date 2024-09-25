package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ground {
	public static void draw(Graphics g) {
		Box ground = new Box(new Point(0,700),new Color(2, 110, 86),1000,300);
		ground.draw(g);
	}
}
