package framework;




import plugins.ConwayCell;
import interfaces.Board;
import interfaces.Visualizer;

public class Framework {

	//private Automaton automaton;
	private Board board;
	
//	public void setAutamoton(Automaton a) {
//		// TODO Auto-generated method stub
//		automaton = a;
//	}

	public void setVisualizer(Visualizer v) {
		// TODO Auto-generated method stub
		
	}

	public void intialstate(boolean[][] a, int[][] state, int x, int y) {
		// TODO Auto-generated method stub
		board = new BoardImpl();
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				if(a[x][y]) board.setCell(new ConwayCell(), x, y);
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
