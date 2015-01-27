import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>(5);
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

		hm.put(null, "four");
		System.out.println(hm.get(1) + "get value");
		// System.out.println(hm.toString());
		// System.out.println(hm.clone());
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
