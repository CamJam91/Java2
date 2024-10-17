package Cameron_Murphy;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class CaveCell extends Box{
	private int depth;
	
		//constructors
	public CaveCell() {
		//TODO: use randomizer method to create random color & depth values
	}
	public CaveCell(Point p1, Point p2, int depth){
		super(p1, p2, new Color(13,234,179,(depth/10)));
		this.depth = depth;
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
	public void randomize() {	
		//TODO: create randomizer method using random number generators
	}
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
    	g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.fillPolygon(new int [] {(int)(super.getP1().getX()), (int)(p3.getX()), (int)(super.getP2().getX()), (int)(p4.getX())}, 
        		new int[] {(int)(super.getP1().getY()),  (int)(p3.getY()), (int)(super.getP2().getY()), (int)(p4.getY())}, POINTS);
	}
	
}