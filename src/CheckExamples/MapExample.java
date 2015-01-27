package CheckExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();

		map.put(1, "one");
		map.put(2, "two");
		map.put(6, "six");
		map.put(3, "three");
		map.put(4, "four");
		map.put(10, "ten");
		map.put(7, "seven");

		System.out.println("Getting the values");
		System.out.println(map.get(1));
		System.out.println("Getting the values");
		for (Map.Entry ma : map.entrySet()) {
			System.out.println(ma);
		}
	}

}
