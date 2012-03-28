package interfaces;

/**
 * A Cell represents a spot in the Board.
 * Each Cell has related Board, Algorithm
 * and State.  All Cells will share one Algorithm
 * and one Board but each Cell has its own State.
 * @author bcharna
 *
 */
public interface Cell {
	
	/**
	 * get the Cell's Board
	 * @return this Cell's Board
	 */
	public Board getBoard();
	
	
	/**
	 * get the Cell's Algorithm which includes the algorithm needed to make
	 * moves
	 * @return this Cell's Algorithm
	 */
	public Algorithm getAlgorithm();
	
	
	/**
	 * get the Cell's State 
	 * @return this Cell's State
	 */
	public State getState();
	
	
	/**
	 * set the Cell's Board
	 * @param b Board to set to this Cell
	 */
	public void setBoard(Board b);
	
	
	/**
	 * set the Cell's Algorithm
	 * @param a Algorithm to set to this Cell
	 */
	public void setAlgorithm(Algorithm a);

	
	/**
	 * set the Cell's State
	 * @param s State to set to this Cell
	 */
	public void setState(State s);

	
	/**
	 * unsure what this does but I remember talking about it- Kyle??
	 */
	public void die();
	
	
}

