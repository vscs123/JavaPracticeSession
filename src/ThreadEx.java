public class ThreadEx extends Thread {

	synchronized void aMethod() {

		for (int i = 1; i < 5; i++) {

			try {

				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}

	synchronized static void bMethod() {

		for (int i = 1; i < 5; i++) {

			try {

				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public void run() {

		aMethod();
		bMethod();

	}

	public static void main(String[] args) {

		ThreadEx t = new ThreadEx();
		t.start();

		ThreadEx t2 = new ThreadEx();
		t2.start();

	}

}
