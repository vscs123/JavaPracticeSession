import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Array list coolection using jdk 1.4
		ArrayList ob = new ArrayList();

		ob.add("first");
		ob.add("second");
	
		ob.add("thrid");
		ob.add("jhj");
		System.out.println(ob.get(3)+"get value");
		Iterator it = ob.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// Array list collection using jdk 1.5
		ArrayList<String> ob1 = new ArrayList<String>();
		ob1.add("one");
		ob1.add("two");
		ob1.add("three");
		for (String obj : ob1) {
			System.out.println(obj);

		}
	}

}
