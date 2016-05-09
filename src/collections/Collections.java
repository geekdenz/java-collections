/*
 * © Copyright 2015
 * Landcare Research
 * 
 * Dual License with
 * 
 * GPL v3 - See http://www.gnu.org/licenses/gpl-3.0.txt
 * 
 * Any derivative work needs to be contributed back to this project
 * unless otherwise agreed with Landcare Research, New Zealand.
 */
package collections;

import java.util.HashSet;
import java.util.Set;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 *
 * @author heuert
 */
public class Collections {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		StrictSet<Number> set = new StrictHashSet<>();
		//Set<Number> set = new HashSet<>();
		set.add(10L);
		set.add(10);
		if (set.containsStrict(10)) {
			System.out.println("in set "+ set);
		} else {
			System.out.println("NO");
		}
		if (new Long(10L).equals(new Integer(10))){
			System.out.println("EQUALS");
		}
		
	}

	private boolean someMethod(StrictSet<? extends Number> set) {
		boolean contains = set.contains(10L);
		// contains = set.containsStrict(10L); // compile time error!
		return contains;
	}
	boolean some(StrictSet<Number> set) {
		return set.containsStrict(10L);
	}
	void shapeBound(StrictSet<? extends Shape> set) {
		set.contains(new Circle());
		// set.containsStrict(new Circle()); // compile time error!
		for (Shape shape : set) {
			shape.autosize();
		}
	}
	// But why not this?
	void shapeme(StrictSet<Shape> set) {
		set.containsStrict(new Circle());
		for (Shape shape : set) {
			shape.autosize();
		}
	}
	
}
