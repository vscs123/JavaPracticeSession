import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new StudentsSort(101, "Vijay", 23));
		al.add(new StudentsSort(106, "Ajay", 27));
		al.add(new StudentsSort(105, "Jai", 21));

		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			StudentsSort st = (StudentsSort) itr.next();
			System.out.println(st.rollno + "" + st.name + "" + st.age);
		}

	}

}

class StudentsSort implements Comparable {
	int rollno;
	String name;
	int age;

	StudentsSort(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object obj) {
		StudentsSort st = (StudentsSort) obj;
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}