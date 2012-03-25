package interfaces;

public interface Automaton {
	
	/**
	 * get the automaton's Board
	 * @return this automaton's Board
	 */
	Board getBoard();
	
	
	/**
	 * get the automaton's State which includes the algorithm needed to make
	 * moves
	 * @return this automaton's State
	 */
	State getState();
	
	
	/**
	 * set the automaton's Board
	 * @param b Board to set to this Automaton
	 */
	void setBoard(Board b);
	
	
	/**
	 * set the automaton's State
	 * @param s State to set to this Automaton
	 */
	void setState(State s);
	
}
