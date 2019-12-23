package lab1_3;

public class TestMain {
	public static void main(String[] args) {
		
		TestMaths m = new TestMaths();
		m.base=2;
		m.index=3;
		m.number=5;
		
		m.power(m.base,m.index);
		m.findFactorial(m.number);
		m.findTable(m.number);
		m.findPrime(m.number);
		m.print();
	}
}
