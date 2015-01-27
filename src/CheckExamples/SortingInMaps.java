package CheckExamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingInMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "one");
		map.put(10, "ten");
		map.put(5, "five");
		System.out.println("");
	}

}

class first {
	int classno;
	int roomno;

	first(int classno, int roomno) {
		this.classno = classno;
		this.roomno = roomno;
	}
}

class SortByRoomno implements Comparator {
	public int compare(Object ob1, Object ob2) {
		first f1 = (first) ob1;
		first f2 = (first) ob2;
		if (f1.roomno == f2.roomno)
			return 0;
		else if (f1.roomno > f2.roomno)
			return 1;
		else
			return -1;
	}
}