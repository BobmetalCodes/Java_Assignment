package Employee_inheritence;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("****Permanent Employee*******");
		System.out.println("Enter Name, id, Base Salary ");

		Perm_Employee pe = new Perm_Employee(scan.nextLine(), scan.next(), scan.nextFloat());

		System.out.println("*******Contract Employee****");
		Contract_Employee ce = new Contract_Employee();
		System.out.println("Enter Name");
		ce.name = scan.nextLine() + scan.nextLine();
		System.out.println("Enter Id");
		ce.id = scan.next();
		System.out.println("Enter Number of Hours");
		ce.noHours = scan.nextFloat();
		System.out.println("Enter Pay per Hour");
		ce.perHour = scan.nextFloat();

		pe.calcSal();
		pe.print();

		ce.calcSal();
		ce.print();

		scan.close();

	}
}
