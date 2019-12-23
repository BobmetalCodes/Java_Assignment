package simple;

public class ThreadA extends Thread {
	public void run() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadA=" + i);
		}
		System.out.println("Exiting ThreadA");
	}
}
