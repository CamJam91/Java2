package edu.sinclair.cameron_murphy.testing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

import edu.sinclair.cameron_murphy.Box;
import edu.sinclair.cameron_murphy.Line;

public class Test extends JComponent {
	public void paintComponent(Graphics g) {
			Line testLine = new Line(new Point(2,2), new Point(200,8),new Color(27, 99, 207), 3);
			testLine.draw(g);
			Box boxTest = new Box(new Point (300,300), new Color(50,99,207),100,200);
			boxTest.draw(g);
	}
}
