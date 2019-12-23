package assign_day5;

public class CktPlayer extends Players implements Printable {
	int runs;

	public CktPlayer() {

	}

	public CktPlayer(String name, int runs) {
		super(name);
		this.runs = runs;
	}

	public void printDetails() {
		System.out.println("Cricketer:");
		super.printName();
		System.out.println("Runs= " + runs);
	}

}
