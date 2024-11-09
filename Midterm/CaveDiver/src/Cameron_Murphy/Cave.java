package Cameron_Murphy;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Cave {
	final int CELL_COUNT = 50;
	final int ROW_COUNT = 10;
	final int COLUMN_COUNT = 10;
	private CaveCell[][] cells = new CaveCell[10][10];
	
	/**
	 * an outer loop tracks our row and inserts different coordinates
	 * our inner loop tracks our column and inserts different coordinates
	 * @param p1
	 */
	public Cave(Point p1) {
			//fill our 2d array
		for (int rowCount = 0; rowCount < 10; rowCount++) {
			for (int colCount = 0; colCount < 10; colCount++) {
				cells[rowCount][colCount] = new CaveCell(new Point(rowCount*70 + p1.x, colCount*70 + p1.y));
			}
		}
	}
	
	/**
	 * nested loop takes each element in the arraylist and calls random on them
	 */
	public void randomize() {
		for (int rowCount = 0; rowCount < 10; rowCount++) {
			for (int colCount = 0; colCount < 10; colCount++) {
				cells[rowCount][colCount].randomize();
			}
		}
		}
	/**
	 * nested loop paints each cell
	 * @param g
	 */
	public void paintCave(Graphics g) {
		for (int rowCount = 0; rowCount < 10; rowCount++) {
			for (int colCount = 0; colCount < 10; colCount++) {
				cells[rowCount][colCount].paint(g);;
			}
		}
	}
	/**
	 * sets oxygen level and initiates helper with first box
	 * @param level
	 * @return
	 */
	public boolean escape(int level) {
		int oxygen = 20;
		boolean path = escapeHelper(0,0,oxygen, level);
		if (path) {
			
		}
		return path;
	}
	/**
	 * 
	 * @param row
	 * @param column
	 * @param oxygen
	 * @param level
	 * @return
	 */
	public boolean escapeHelper(int row, int column, int oxygen, int level) {
		if (oxygen < 0 || row >= ROW_COUNT || column >= COLUMN_COUNT) {return false;} //base cases, check if oxygen is depleted (-1), or if we are at the last right or bottom square
		CaveCell currentCell = cells[row][column];
		if (currentCell.getDepth() > level) {return false;} //check our level against the cell depth
		if (row == ROW_COUNT-1 && column == COLUMN_COUNT-1) { 
			cells[ROW_COUNT-1][COLUMN_COUNT-1].setColor(Color.yellow);
			return true;} //if we have reached the last box we return true
		if (escapeHelper(row, column + 1, oxygen-1, level) || escapeHelper(row+1, column, oxygen-1, level)) {
			cells[row][column].setColor(Color.yellow);
			return true;} //smaller caller, check down || right
		return false; //no path was found
	}
	
}
