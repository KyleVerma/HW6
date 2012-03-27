package interfaces;

public interface Automaton {
	
	/**
	 * get the automaton's Board
	 * @return this automaton's Board
	 */
	public Board getBoard();
	
	
	/**
	 * get the automaton's Algorithm which includes the algorithm needed to make
	 * moves
	 * @return this automaton's Algorithm
	 */
	public Algorithm getAlgorithm();
	
	
	/**
	 * set the automaton's Board
	 * @param b Board to set to this Automaton
	 */
	public void setBoard(Board b);
	
	
	/**
	 * set the automaton's Algorithm
	 * @param s Algorithm to set to this Automaton
	 */
	public void setAlgorithm(Algorithm a);
	
	
	/**
	 * unsure what this does but I remember talking about it- Kyle??
	 */
	public void die();
	
	
}
