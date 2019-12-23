package student_report;

public class Student {
	private int id;
	private String name;
	private Exam[] exams;
	private ReportCard report;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public ReportCard getReport() {
		return report;
	}

	public void setReport(ReportCard report) {
		this.report = report;
	}

	public void calculatePercentage() {
		float totalMarks = 0.0f;
		float grandTotal = 0.0f;

		for (Exam exam : exams) {
			totalMarks += exam.getMaxMarks();
			grandTotal += exam.getObtMarks();
		}

		report.setPerc(grandTotal / totalMarks * 100.0f);
		report.calculateGrade();
	}

	void printStudent() {
		System.out.println("id = " + id);
		System.out.println("Name = " + name);

		report.printReportCard();

		for (Exam exam : exams) {
			exam.printExam();
		}
	}
}
