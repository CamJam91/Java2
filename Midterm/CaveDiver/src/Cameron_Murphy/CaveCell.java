package Cameron_Murphy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;


public class CaveCell{
	Point p1;
	final int width = 70;
	final int height = 70;
	private int depth;
	private Color color;
	final Font font = new Font("Times new Roman", Font.PLAIN, 18);
	
		//constructors
	/**
	 * This constructor lacks a depth int as a parameter. It is created with the randomize() method. 
	 * @param p1
	 */
	public CaveCell(Point p1) {
		this.p1 = p1;
		randomize(); //random depth is now set
			//alpha is a fraction of depth
		color = new Color(13,234,179,(depth*25));
	}
	
		//setters
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
		//getters
	public int getDepth() {
		return depth;
	}
	
		//methods
	/**
	 * randomize depth int of cell
	 */
	public void randomize() {	
		Random random = new Random();
		int newDepth = random.nextInt(10);
		depth = newDepth; 
	}
	
	/**
	 * Paint cell with number in it
	 * @param g
	 */
	public void paint(Graphics g) {
		//test
		g.setColor(color);
    	g.fillRect((int)this.p1.x, (int)this.p1.y, width, height);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString(String.valueOf(depth), (int)p1.x + 2, (int)p1.y+18);
	}
}