package interfaces;

public interface Algorithm {

	/**
	 * Looks at a view of the local environment, and decides how to act.
	 * The Command should NOT be executed by the Algorithm; that is the job of
	 * the client of the Algorithm. Assumes that b and c are not null.
	 *  
	 * 
	 * @param b the world to inspect
	 * @param c the automaton to consider
	 * 
	 * @return a command to execute. May return a null command.
	 */
	Command act(Board b, Cell c);
}
