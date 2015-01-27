import java.util.HashSet;
import java.util.Set;

public class EqualsMethodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		int e3 = 100;

		e1.setId(100);
		e2.setId(100);
		System.out.println(e2.getId() == e3);
		System.out.println(e1.getId() == e2.getId());
		Set<Employ> employees = new HashSet<Employ>();
		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);

	}

}

class Employ {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (getClass() != o.getClass()) {
			return false;
		}

		Employ e = (Employ) o;
		return (this.getId() == e.getId());

	}
}