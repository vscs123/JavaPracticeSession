public class Synchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table ob = new Table();
		MyThread1 ob1 = new MyThread1(ob);
		MyThread2 ob2 = new MyThread2(ob);

		ob1.start();
		ob2.start();

	}

}

class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {

	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(1);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}
}
