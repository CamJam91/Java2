package edu.sinclair.cameron_murphy;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class PictureComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Scenery.draw(g);
		House.draw(g);
		g.setColor(Color.WHITE);
		g.drawString("Cameron Murphy", 100, 200);
	}
}
