package assign_day5;

public class FtPlayer extends Players implements Printable {

	int goals;

	public FtPlayer() {

	}

	public FtPlayer(String name, int goals) {
		super(name);
		this.goals = goals;
	}

	public void printDetails() {
		System.out.println("Footballer:");
		super.printName();
		System.out.println("Goals= " + goals);
	}

}
