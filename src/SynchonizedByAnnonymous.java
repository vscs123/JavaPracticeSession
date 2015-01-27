public class SynchonizedByAnnonymous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Student ob = new Student();
		Thread ob1 = new Thread() {
			public void run() {
				ob.totalStudents(2);
			}
		};
		Thread ob2 = new Thread() {
			public void run() {
				ob.totalStudents(5);
			}
		};
		ob1.start();
		ob2.start();
	}
}

class Student {
	synchronized void totalStudents(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
