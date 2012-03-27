package interfaces;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.ImageIcon;



public interface Visualizer	{


	/*
	 * 
	 * Javadocs need to be created!
	 * 
	 */
	void setVisualState(Hashtable<String,Object> s, int row, int col);
	void setVisualColor(Color color, int row, int col);
	void setVisualIcon(ImageIcon i, int row, int col);
	
	Hashtable<String,Object> getVisualState(int row, int col);
	
	
	int getCellState(int row, int col);

	void paint();
}

interface VisualizerFactory{
	/*
	 * 
	 * constructors should be fixed
	 * 
	 */
	public Visualizer createVisualizer(int row, int col, int[] states);
	public Visualizer createVisualizer(int row, int col);
}


/*
The intent of the current design is to create a flexible framework for visualizing cellular automatons.
Visualizer is the main interface and is responsible for displaying the cellular automatons.
It performs behind-the-scenes actions to prepare the system for display on the user interface.
It collaborates with the AI interface to inquire about the state of each cell in every step.
The VisualizerFactory is responsible for constructing visualizers.
*/