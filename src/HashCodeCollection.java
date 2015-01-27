public class HashCodeCollection {

	public static void main(String[] args) {
		Employe ob1 = new Employe();
		Employ ob2 = new Employ();
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}

}

class Employe {
	String gender;
	String name;

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}
		Employe otherObj = new Employe();
		if ((getGender() == null && otherObj.getGender() == null)
				|| (getGender() != null && getGender().equals(
						otherObj.getGender()))) {

			if ((getName() == null && otherObj.getName() == null)
					|| (getName() != null && getName().equals(
							otherObj.getName()))) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int hashCode() {
		return (getName() + getGender()).hashCode();
	}
}