package Interface;

public class TestPrintable {
	public static void main(String[] args) {

		Printer p1 = new Printer("Dell Printer");
		p1.print();

		Printer p2 = new Printer();
		p2.name = "HP Printer";
		p2.print();
	}

}
