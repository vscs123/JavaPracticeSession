package CheckExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap();
		map.put(3, "three");
		map.put(1, "one");
		map.put(2, "two");
		map.put(6, "six");
		map.put(5, "five");
		System.out.println();
		for (Map.Entry ma : map.entrySet()) {
			System.out.println(ma);
		}
	}
}
