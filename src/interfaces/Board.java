package interfaces;

import java.awt.Color;
import java.util.ArrayList;

public interface Board {
	
	//Automaton cells; ivars dont go in interface
	//ArrayList<ArrayList<Hashtable<String,Object>>> cells = new ArrayList<ArrayList<Hashtable<String,Object>>>();
	// a cell is actually a hash table with <String,Object>s
	
	/**
	 * get all cells in board
	 * @return 2D array of cells (Automaton objects)
	 */
	public ArrayList<ArrayList<Cell>> getCells();
	

	/**
	 * get a Cell based off coords.  (0,0) is upper left hand corner
	 * (boardWidth,boardHeight) is lower right hand corner.
	 * @param x x coord of cell 
	 * @param y y coord of cell
	 * @return Automaton at (x,y)
	 * 
	 */
	public Cell getCell(int x, int y);
	
	
	/**
	 * 
	 * @param c Cell to store at (x,y)
	 * @param x x location to store cell
	 * @param y y location to store cell
	 */
	public void setCell(Cell c, int x, int y);

	
	/**
	 * set Board width
	 * @param w
	 */
	public void setWidth(int w);
	
	/**
	 * set Board height
	 * @param g
	 */
	public void setHeight(int h);
	
	/**
	 * 
	 * @return Board width
	 */
	public int getWidth();
	
	
	/**
	 * 
	 * @return Board height
	 */
	public int getHeight();
	
}
