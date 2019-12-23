package employee_array;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Employees");

		Employee[] employees = new Employee[scan.nextInt()];

		for (int i = 0; i < employees.length; i++) {
			Employee e = new Employee();

			System.out.println("Enter information for employee " + (i + 1));

			System.out.println("Enter id");
			e.id = scan.nextInt();

			System.out.println("Enter name");
			e.name = scan.next();

			System.out.println("Enter salary");
			e.salary = scan.nextFloat();

			employees[i] = e;
		}

		for (int i = 0; i < employees.length; i++) {
			System.out.println("Displaying information for employee " + (i + 1));
			employees[i].print();
		}
		scan.close();
	}

}
