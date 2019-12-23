package simple;

public class ThreadB extends Thread {
	public void run() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadB=" + i);
		}
		System.out.println("Exiting ThreadB");
	}
}
