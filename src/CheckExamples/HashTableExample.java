package CheckExamples;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable();
		ht.put(1, "one");
		ht.put(10, "two");
		ht.put(5, "five");
		ht.put(3, "three");
		ht.put(6, "six");
		for (Entry<Integer, String> h : ht.entrySet()) {
			System.out.println(h.getKey() + " " + h.getValue());
		}
	}

}
