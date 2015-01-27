import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class SynchronizedHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(2, "Anil");
		hmap.put(44, "Ajit");
		hmap.put(1, "Brad");
		hmap.put(4, "Sachin");
		hmap.put(88, "XYZ");

		Map<Integer, String> map = Collections.synchronizedMap(hmap);
		Set set = map.entrySet();
		synchronized (map) {
			Iterator i = set.iterator();
			// Display elements
			while (i.hasNext()) {
				Map.Entry me = (Map.Entry) i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}

	}

}
