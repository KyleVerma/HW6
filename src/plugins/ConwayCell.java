package plugins;

import interfaces.Algorithm;
import interfaces.Board;
import interfaces.Cell;
import interfaces.State;

public class ConwayCell implements Cell {
	
	State s;

	@Override
	public Board getBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Algorithm getAlgorithm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBoard(Board b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAlgorithm(Algorithm a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}
	
	public void move(Board b, Direction dir) {
		// TODO Auto-generated method stub

	}

	@Override
	public State getState() {
		return s;
	}

	@Override
	public void setState(State s) {
		this.s = s;
	}

}
