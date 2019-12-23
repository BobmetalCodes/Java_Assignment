package lab2_4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 1st Exam Name, Total Marks, Duration:");
		Exam a = new Exam(scan.nextLine(), scan.nextFloat(), scan.nextFloat());
		Exam b = new Exam();

		System.out.println("Enter 2st Exam Name, Total Marks, Duration:");
		b.setExamName(scan.next());
		b.setTotalMarks(scan.nextFloat());
		b.setDuration(scan.nextFloat());

		a.print();
		b.print();
		scan.close();
	}
}
