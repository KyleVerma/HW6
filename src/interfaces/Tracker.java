package interfaces;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * The Tracker class is used to record past Boards and visual states of
 * respective Boards in order to rewind.
 * Note: with each 'tick', both stacks in Tracker will be pushed with the previous
 * Board and visual states.
 * @author bcharna
 *
 */
public interface Tracker {
	
	/**
	 * push a Board onto stack A
	 * @param b Board object
	 */
	void pushBoard(Board b);
	
	/**
	 * pop the last Board from stack A
	 * @return last Board object
	 */
	Board popBoard();
	
	
	/**
	 * push a 2D list of Hashtables that represent visual states onto stack B
	 * @param s visual states.  Of type ArrayList<ArrayList<Hashtable<String,Object>>>
	 */
	void pushVisualStates(ArrayList<ArrayList<Hashtable<String,Object>>> s);
	
	/**
	 * pop the last Board from stack B
	 * @return last 2D list of visual states
	 */
	ArrayList<ArrayList<Hashtable<String,Object>>> popVisualStates();

}
