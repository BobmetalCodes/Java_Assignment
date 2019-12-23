package student_report;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		Student[] students = new Student[scan.nextInt()];

		for (int i = 0; i < students.length; i++) {

			students[i] = new Student();
			System.out.println("Enter Id of Student " + (i + 1));
			students[i].setId(scan.nextInt());
			System.out.println("Enter Name of Student " + (i + 1));
			students[i].setName(scan.next());

			System.out.println("Enter Number of Exams");
			Exam[] exams = new Exam[scan.nextInt()];

			for (int j = 0; j < exams.length; j++) {
				exams[j] = new Exam();
				System.out.println("Enter Exam Name");
				exams[j].setExamName(scan.next());

				System.out.println("Enter Maximum Marks");
				exams[j].setMaxMarks(scan.nextFloat());

				System.out.println("Enter Obtained Marks");
				exams[j].setObtMarks(scan.nextFloat());
			}
			students[i].setExams(exams);
			students[i].setReport(new ReportCard());
			students[i].calculatePercentage();
		}

		for (Student student : students) {
			student.printStudent();
		}

		scan.close();
	}
}
