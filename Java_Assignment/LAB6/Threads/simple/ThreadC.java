package simple;

public class ThreadC implements Runnable {

	public void run() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadC=" + i);
		}
		System.out.println("Exiting ThreadC");
	}

}
