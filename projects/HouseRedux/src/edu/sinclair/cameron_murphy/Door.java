package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Door {
	public static void draw(Graphics g) {
		Box door = new Box(new Point(400, 650),new Color(59, 32, 15), 100, 150);
		door.draw(g);
		Oval knob = new Oval(new Point(475,700),new Point(490,715), Color.BLACK,20,20);
		knob.draw(g);
	}
}