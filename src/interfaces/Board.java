package interfaces;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Hashtable;

public interface Board {
	
	//Hashtable<String, Object> cells; ivars dont go in interface
	//ArrayList<ArrayList<Hashtable<String,Object>>> cells = new ArrayList<ArrayList<Hashtable<String,Object>>>();
	// a cell is actually a hash table with <String,Object>s
	
	/**
	 * get all cells in board
	 * @return 2D array of cells (hash tables) containing keys like enabled and color
	 */
	ArrayList<ArrayList<Hashtable<String,Object>>> getCells();
	

	/**
	 * get a cell based off coords.  (0,0) is upper left hand corner
	 * (boardWidth,boardHeight) is lower right hand corner.
	 * @param x x coord of cell 
	 * @param y y coord of cell
	 * @return array of hash tables containing keys like enabled and color
	 */
	Hashtable<String,Object> getCell(int x, int y);
	
	
	/**
	 * 
	 * @param cell cell to store at coords
	 * @param x x location to store cell
	 * @param y y location to store cell
	 */
	void setCell(Hashtable<String,Object> cell, int x, int y);

	
	
	/**
	 * 
	 * @param visisbility state of cell (true of false)
	 * @param x x location of cell to modify
	 * @param y y location of cell to modify
	 */
	void setCellVisibility(boolean visibility, int x, int y);

	

	
	/**
	 * 
	 * @param color color to set color key of cell
	 * @param x x location of cell to modify
	 * @param y y location of cell to modify
	 */
	void setCellColor(Color color, int x, int y);


	
}
