import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCoeExample {

	/**
	 * @param args
	 */
	static long search;
	public static void main(String[] args) {
		HashMap<Long, String> map = new HashMap();
		for (long i = 0; i <= 100000; i++) {
			map.put( i, "name" + i);

		}
		
		System.out.println(System.currentTimeMillis());
		// Map.Entry m1=(Entry)

		search=780;
		System.out.println(map.get(search));
		System.out.println(System.currentTimeMillis());

	}
	public int hashCode(){
		return (int) search;
	}

}
