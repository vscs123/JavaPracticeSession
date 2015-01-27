package CheckExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(2);
		set.add(10);
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(9);
		set.add(6);
		set.add(7);
		System.out.println(set.hashCode());
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
