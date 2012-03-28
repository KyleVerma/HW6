package framework;

import interfaces.Board;
import interfaces.Visualizer;

public interface Framework {

	//private Automaton automaton;
	private Board board;
	
//	public void setAutamoton(Automaton a) {
//		// TODO Auto-generated method stub
//		automaton = a;
//	}
	
	// Associates the supplied visualizer to the framework
	public void setVisualizer(Visualizer v);

	// Sets up the initial state of the board
	public void intialstate(Cell[][] a, int x, int y);

	// Runs the framework
	public void run();
}
