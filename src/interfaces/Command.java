package interfaces;

public interface Command {
	/** Executes this command on behalf of the Cell using the
	 *  board specified.
	 *  
	 *  @throws IllegalArgumentException if automaton or b is null.
	 */
	void execute(Cell c, Board b);
}
