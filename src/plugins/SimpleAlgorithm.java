package plugins;

import interfaces.Algorithm;
import interfaces.Board;
import interfaces.Cell;
import interfaces.Command;

public class SimpleAlgorithm implements Algorithm {

	private SimpleAlgorithm(){
	}
	
	
	private static SimpleAlgorithm myAlgorithm = new SimpleAlgorithm();
	
	/**
	 * This method will return the single SimpleAlgorithm instance.
	 * SimpleAlgorithm is shared between all SimpleAutomota.
	 *
	 * @return the algorithm
	 */
	public static SimpleAlgorithm getAlgorithm(){
		return myAlgorithm;
	}
	
	@Override
	public Command act(Board b, Cell c) {
		// TODO Auto-generated method stub
		Direction allDirections[] = Direction.values();
		return new MoveCommand(allDirections[0]);
	}
}
