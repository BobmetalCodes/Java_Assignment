package assign_day5;

import java.util.Scanner;

public class TestPrintable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		FtPlayer f = new FtPlayer();
		System.out.println("Enter Footballer Name and Goals");
		f.name = scan.nextLine();
		f.goals = scan.nextInt();

		f.printDetails();

		System.out.println("Enter Cricketer Name and Runs");
		CktPlayer c = new CktPlayer(scan.nextLine() + scan.nextLine(), scan.nextInt());

		c.printDetails();

		scan.close();
	}
}
