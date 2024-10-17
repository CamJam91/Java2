package Cameron_Murphy;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Cave {
	final int CELL_COUNT = 50;
	final int ROW_COUNT = 10;
	final int COLUMN_COUNT = 10;
	private ArrayList<ArrayList<CaveCell>> Cells = new ArrayList<>();
	
	/**
	 * an outer loop tracks our row and inserts different coordinates
	 * our inner loop tracks our column and inserts different coordinates
	 * @param p1
	 */
	public Cave(Point p1) {
			//fill our 2d array
		for (int colCount = 0; colCount < ROW_COUNT; colCount++) {
			ArrayList<CaveCell> CellRow = new ArrayList<>();
			for(int rowCount = 0; rowCount < COLUMN_COUNT; rowCount++) {
				Point row = new Point(p1.x + (rowCount*70), p1.y + (colCount*70));
				CellRow.add(new CaveCell(new Point(row)));
			}
			Cells.add(CellRow); //add cell array to outer array
		}
	}
	
	/**
	 * nested loop takes each element in the arraylist and calls random on them
	 */
	public void randomize() {
		for (int rowCount = 0; rowCount < ROW_COUNT; rowCount++) {
			for (int colCount = 0; colCount < COLUMN_COUNT; colCount++) {
				Cells.get(rowCount).get(colCount).randomize();
			}
		}
	}
	
	public void paintCave(Graphics g) {
		for (int rowCount = 0; rowCount < ROW_COUNT; rowCount++) {
			for (int colCount = 0; colCount < COLUMN_COUNT; colCount++) {
				Cells.get(rowCount).get(colCount).paint(g);
			}
		}
	}
}
