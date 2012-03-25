package interfaces;

public interface Tracker {
	
	/**
	 * push a Board onto the stack
	 * @param b
	 */
	void pushBoard(Board b);
	
	/**
	 * pop the last Board from stack
	 * @return last Board object
	 */
	Board popBoard();

}
