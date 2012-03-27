package plugins;

import interfaces.Automaton;
import interfaces.Board;
import interfaces.Command;

public class MoveCommand implements Command {
	private Direction dir;

	public MoveCommand(Direction dir) {
		if (dir == null){
			throw new IllegalArgumentException("Direction cannot be null");
		}
		
		this.dir = dir;
	}
	
	@Override
	public void execute(Automaton a, Board b) {
		if(a == null){
			throw new IllegalArgumentException("Actor cannot be null");
		}
		
		if(b == null){
			throw new IllegalArgumentException("World cannot be null");
		}
		
		// was : (SimpleAutomaton).move(b, dir); then I added SimpleAutomaton
		// as subclass of Automaton and added move method in it.

		((SimpleAutomaton)a).move(b, dir); //is this right Kyle?
	}
}
