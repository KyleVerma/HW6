package interfaces;

import java.awt.Color;

import javax.swing.ImageIcon;


public interface Visualizer {
	/*
	 * Sets an association between state and a given visual object
	 *
	 *
	 * @param state - State of the cell
	 * @param icon - custom visual object to be used for painting the cell
	 */
	 void setStateIcon(State state, ImageIcon icon);

	/*
	 * Sets an association between state and a given visual object
	 *
	 *
	 * @param state - State of the cell
	 * @param color - color used for painting the cell
	 */
	 void setStateColor(State state, Color color);


       /*
	 * Displays a cellular automaton on a User Interface
	 *
	 * @param board - board representing current state of automaton
	 */
	 void paint(Board board);
}


 interface VisualizerFactory{
	/*
	 * Constructs a visualizer compatible with row x col board of cells and
possible states
	 *
	 * @param rows - number of rows
	 * @param cols - number of columns
	 * @param states - specifies all possible states of the automaton
	 */
	void createVisualizer(int rows, int cols, State[] states);

	/*
	 * Constructs a visualizer compatible with row x col board of cells and
{0,1} states
	 *
	 * @param rows - number of rows
	 * @param cols - number of columns
	 */
	void createVisualizer(int rows, int cols);
}
