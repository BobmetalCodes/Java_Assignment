package simple;

public class TestThreads {
	public static void main(String[] args) {

		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadC tc = new ThreadC();

		ta.start();
		tb.start();
		Thread t1 = new Thread(tc);
		t1.start();

	}
}
