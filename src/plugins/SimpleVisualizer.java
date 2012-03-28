package plugins;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.ImageIcon;

import framework.Framework;

import interfaces.Visualizer;




public class SimpleVisualizer implements Visualizer{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Framework fw = new Framework();
		fw.setVisualizer(new SimpleVisualizer());
		Cell cell[][] = new Cell[5][5];
		fw.intialstate(cell, 5, 5);
		fw.run();
	}

	@Override
	public void setVisualState(Hashtable<String, Object> s, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisualColor(Color color, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisualIcon(ImageIcon i, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hashtable<String, Object> getVisualState(int row, int col) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

}
