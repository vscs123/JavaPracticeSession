public class RailwayReservationTicketThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Railway ob = new Railway();
		Ticket1 t1 = new Ticket1(ob);
		Ticket2 t2 = new Ticket2(ob);
		t1.start();
		t2.start();

	}

}

class Railway {
	synchronized void Ticket(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println("ticket booking for this thread" + i);
			System.out.println(n * i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Ticket1 extends Thread {
	Railway r;

	Ticket1(Railway r) {
		this.r = r;
	}

	public void run() {
		r.Ticket(1);
	}
}

class Ticket2 extends Thread {
	Railway r;

	Ticket2(Railway r) {
		this.r = r;
	}

	public void run() {
		r.Ticket(5);
	}
}

class Ticket3 extends Thread {
	Railway r;

	Ticket3(Railway r) {
		this.r = r;
	}

	public void run() {
		r.Ticket(9);
	}
}