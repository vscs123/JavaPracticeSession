import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StaticBlockUsingMaps {

	static {
		System.out.println("Static block in maps");
	}

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
