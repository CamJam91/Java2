package Cameron_Murphy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

public class CaveComponent extends JComponent {
	//test
	@Override
	public void paintComponent(Graphics g) {
		Point p1Test = new Point(200,200);
		Point p2Test = new Point(400,400);
		CaveCell testCell = new CaveCell(p1Test, p2Test,10);
		testCell.draw(g);
	}
}
