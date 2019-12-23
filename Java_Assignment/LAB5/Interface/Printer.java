package Interface;

public class Printer extends Product implements Printable {

	public Printer() {

	}

	public Printer(String name) {
		super(name);
	}

	public void print() {
		super.printName();
		System.out.println("Printing........");
	}

}
