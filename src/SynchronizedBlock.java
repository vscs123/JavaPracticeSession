public class SynchronizedBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp ob = new Emp();
		Emp1 ob1 = new Emp1(ob);
		Emp2 ob2 = new Emp2(ob);
		ob1.start();
		ob2.start();
	}

}

class Emp {
	void totalEmployees(int n) {
		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class Emp1 extends Thread {
	Emp e;

	Emp1(Emp e) {
		this.e = e;
	}

	public void run() {
		e.totalEmployees(2);
	}
}

class Emp2 extends Thread {
	Emp e;

	Emp2(Emp e) {
		this.e = e;
	}

	public void run() {
		e.totalEmployees(4);
	}
}