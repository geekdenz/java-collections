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

/**
 *
 * @author heuert@landcareresearch.co.nz
 */
public class StrictHashSet<E> extends HashSet<E> implements StrictSet<E> {

	@Override
	public boolean containsStrict(E element) {
		return this.contains(element);
	}

}
