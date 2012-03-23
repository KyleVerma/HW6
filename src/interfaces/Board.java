package interfaces;

import java.util.Hashtable;

public interface Board {
	
	//Hashtable<String, Object> cells; ivars dont go in interface
	
	/**
	 * 
	 * @return array of hash tables containing keys like enabled and color
	 */
	Hashtable<String, Object>[] getCells();
	
	
	
}
