import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ArraylistNoofRecords extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		System.out.println(new Date().getMinutes());

		for (int i = 0; i < 100; i++) {

			Master m = new Master(10 + i, "name");
			al.add(m);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(m.id + " " + m.name);
		}

		for (Object list : al) {

			Master m = (Master) list;
			System.out.println(m + " jh");
		}
		System.out.println(new Date().getMinutes());

	}
}

class Master {
	int id;
	String name;

	Master(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return String.valueOf(id) + "--" + name;
	}
}