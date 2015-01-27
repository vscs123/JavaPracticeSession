import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		al.add("four");
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		System.out.println(al.remove(1));
		ListIterator<String> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
