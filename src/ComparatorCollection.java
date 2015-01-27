import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorCollection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Employee(1, "one", 2000));
		al.add(new Employee(2, "two", 5000));
		al.add(new Employee(3, "three", 3000));
		al.add(new Employee(4, "four", 1000));

		System.out.println("Sorting Collections by name wise");
		Collections.sort(al, new CompareEmployeeName());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Employee emp1 = (Employee) itr.next();
			System.out.println(emp1.name + " " + emp1.id + " " + emp1.salary);
		}
		System.out.println("Sorting Collections by salary wise");
		Collections.sort(al, new CompareSalary());
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Employee emp2 = (Employee) it.next();
			System.out.println(emp2.salary + " " + emp2.name + " " + emp2.id);
		}
	}

}

class Employee {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

class CompareEmployeeName implements Comparator {
	public int compare(Object ob1, Object ob2) {
		Employee emp1 = (Employee) ob1;
		Employee emp2 = (Employee) ob2;
		return emp1.name.compareTo(emp2.name);
	}
}

class CompareSalary implements Comparator {
	public int compare(Object ob1, Object ob2) {
		Employee emp1 = (Employee) ob1;
		Employee emp2 = (Employee) ob2;

		if (emp1.salary == emp2.salary)
			return 0;
		else if (emp1.salary > emp2.salary)
			return 1;
		else
			return -1;
	}

}