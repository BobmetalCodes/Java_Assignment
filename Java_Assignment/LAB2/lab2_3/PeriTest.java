package lab2_3;

import java.util.Scanner;

public class PeriTest {
	public static void main(String[] args) {

		PerimeterFinder a = new PerimeterFinder();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Side:");
		a.setSide(scan.nextInt());
		System.out.println("Enter Radius:");
		a.setRadius(scan.nextFloat());
		System.out.println("Enter Length and Breadth:");
		a.setLength(scan.nextInt());
		a.setBreadth(scan.nextInt());

		a.print();

		scan.close();
	}

}
