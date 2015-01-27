import java.util.Comparator;

public class EqualsAndComparatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vechile v1 = new Vechile();
		Vechile v2 = new Vechile();
		v1.setTires(3);
		v2.setTires(3);
		System.out.println(v1.equals(v2));
	}

}

class Vechile {
	int tires;
	private String vechileName;

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public String getVechileName() {
		return vechileName;
	}

	public void setVechileTires(String vechileName) {
		this.vechileName = vechileName;
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

		Vechile e = (Vechile) o;
		return (this.getTires() == e.getTires());

	}
}

class Bike implements Comparator {

	public int compare(Object ob1, Object ob2) {
		Vechile v1 = (Vechile) ob1;
		Vechile v2 = (Vechile) ob2;
		if (v1.tires == v2.tires)
			return 0;
		else if (v1.tires > v2.tires)
			return 1;
		else
			return -1;

	}

}