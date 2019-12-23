/*******Student Grade Constructors******/

package lab2_2;

import java.util.Scanner;

public class StudTest {

	public static void main(String[] args) {

		Student a = new Student();
		Student b = new Student(123, "John Doe", 67.2f);
		Student c = new Student();
		Student d = new Student(224, "Jack James", 34.76f);

		Scanner scan = new Scanner(System.in);

		a.setId(100);
		a.setName("Raj Kumar");
		a.setPercentage(89.65f);

		System.out.println("Enter ID");
		c.setId(scan.nextInt());
		System.out.println("Enter NAME");
		c.setName(scan.nextLine() + scan.nextLine());
		System.out.println("Enter PERCENTAGE");
		c.setPercentage(scan.nextFloat());

		a.print();
		b.print();
		c.print();
		d.print();

		scan.close();

	}

}
