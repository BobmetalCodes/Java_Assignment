/*******Employee Constructors******/

package lab2_1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(10, "Jane Doe", 54665.87f);
		Employee e3 = new Employee();

		Scanner scan = new Scanner(System.in);

		e1.setId(5);
		e1.setName("John Doe");
		e1.setSalary(6500.65f);

		System.out.println("Enter ID: ");
		e3.setId(scan.nextInt());
		System.out.println("Enter NAME: ");
		e3.setName(scan.nextLine() + scan.nextLine());
		System.out.println("Enter SALARY: ");
		e3.setSalary(scan.nextFloat());

		e1.print();
		e2.print();
		e3.print();
		scan.close();

	}

}
