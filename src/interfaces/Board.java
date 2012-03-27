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
	public ArrayList<ArrayList<Automaton>> getCells();
	

	/**
	 * get a cell based off coords.  (0,0) is upper left hand corner
	 * (boardWidth,boardHeight) is lower right hand corner.
	 * @param x x coord of cell 
	 * @param y y coord of cell
	 * @return Automaton at (x,y)
	 * 
	 */
	public Automaton getCell(int x, int y);
	
	
	/**
	 * 
	 * @param a Automaton to store at (x,y)
	 * @param x x location to store cell
	 * @param y y location to store cell
	 */
	public void setCell(Automaton a, int x, int y);

	
	
	/**
	 * 
	 * @param visisbility state of cell (true of false)
	 * @param x x location of cell to modify
	 * @param y y location of cell to modify
	 */
	public void setCellVisibility(boolean visibility, int x, int y);

	

	
	/**
	 * 
	 * @param color color to set color key of cell
	 * @param x x location of cell to modify
	 * @param y y location of cell to modify
	 */
	public void setCellColor(Color color, int x, int y);


	
	//TODO add get and setters for width and height
}
