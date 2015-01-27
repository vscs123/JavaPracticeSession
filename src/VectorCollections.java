import java.util.ArrayList;
import java.util.Vector;

public class VectorCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector(5);
		v1.setSize(3);
		Vector v2 = new Vector(2);
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		v1.add(8);
		v1.add(9);
		v1.add(10);
		v1.add(11);
		v1.add(12);
		v2.add(3);
		v2.add(6);
		v2.add(1);

		v1.retainAll(v2);
		for (Integer ob : v1) {
			System.out.println(ob);
		}

		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		for (Integer ob : al) {
			System.out.println(ob);
		}
	}

}
