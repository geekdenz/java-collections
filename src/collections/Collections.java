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
	
}
