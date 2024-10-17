package Cameron_Murphy;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class CaveComponent extends JComponent {
	private Cave cave;
	
	public CaveComponent() {
		cave = new Cave(new Point(250,100));
	}
	@Override
	public void paintComponent(Graphics g) {
		cave.paintCave(g);
	}
	public void randomize() {
		cave.randomize();
	}
}
