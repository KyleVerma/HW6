package interfaces;

public interface Command {
	/** Executes this command on behalf of the automaton using the
	 *  board specified.
	 *  
	 *  @throws IllegalArgumentException if automaton or b is null.
	 */
	void execute(Automaton a, Board b);
}
