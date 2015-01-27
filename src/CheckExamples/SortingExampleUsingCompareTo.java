package CheckExamples;

import java.util.Arrays;

public class SortingExampleUsingCompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vegatable[] veg = new Vegatable[4];
		Vegatable pineappale = new Vegatable("Pineapple", 4);
		Vegatable apple = new Vegatable("Apple", 100);
		Vegatable orange = new Vegatable("Orange", 80);
		Vegatable banana = new Vegatable("Banana", 90);

		veg[0] = pineappale;
		veg[1] = apple;
		veg[2] = orange;
		veg[3] = banana;

		Arrays.sort(veg);
		int i = 0;
		for (Vegatable temp : veg) {
			System.out
					.println(temp.getNameOfveg() + " " + temp.getCountOfveg());
		}
	}
}

class Vegatable implements Comparable<Vegatable> {
	String NameOfVeg;
	int CountOfVeg;

	Vegatable(String NameOfVeg, int CountOfVeg) {
		this.NameOfVeg = NameOfVeg;
		this.CountOfVeg = CountOfVeg;
	}

	public String getNameOfveg() {
		return NameOfVeg;
	}

	public int getCountOfveg() {
		return CountOfVeg;
	}

	public void setNameOfveg(String NameOfVeg) {
		this.NameOfVeg = NameOfVeg;
	}

	public void setCouuntOfveg(int CountOfVeg) {
		this.CountOfVeg = CountOfVeg;
	}

	public int compareTo(Vegatable otherCompareVegCount) {
		int countOfVeg = (int) otherCompareVegCount.getCountOfveg();
		return this.CountOfVeg - countOfVeg;
	}

}