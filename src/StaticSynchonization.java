public class StaticSynchonization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VillageBank v = new VillageBank();
		CityBank c = new CityBank();
		InternationalBank i = new InternationalBank();
		ReserveBank r = new ReserveBank();
		v.start();
		c.start();
		i.start();
		r.start();
	}

}

class Bank {
	synchronized static void totalBanks(int n) {
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

class VillageBank extends Thread {
	public void run() {
		Bank.totalBanks(10);
	}
}

class CityBank extends Thread {
	public void run() {
		Bank.totalBanks(100);
	}
}

class InternationalBank extends Thread {

	public void run() {
		Bank.totalBanks(1000);
	}
}

class ReserveBank extends Thread {
	public void run() {
		Bank.totalBanks(1);
	}
}