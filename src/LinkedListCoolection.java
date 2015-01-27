import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCoolection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Students s = new Students("sitha", 12);
		Students s1 = new Students("ram", 17);
		Students s2 = new Students("ravanam", 11);

		LinkedList ll = new LinkedList();
		ll.add(s);
		ll.add(s1);
		ll.add(s2);

		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			Students st = (Students) itr.next();
			System.out.println(st.name);
		}

		LinkedList li = new LinkedList();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		li.add(6);
		li.add(7);
		System.out.println(li.get(2));
		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Students {
	String name;
	int age;

	Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
}