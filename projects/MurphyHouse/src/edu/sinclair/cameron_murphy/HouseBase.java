package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class HouseBase {
	public static void draw(Graphics g) {
		Box houseBase = new Box(new Point(200,500), new Color(168, 98, 50),500, 300);
		houseBase.draw(g);
	}
}