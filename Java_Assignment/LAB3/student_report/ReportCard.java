package student_report;

public class ReportCard {

	private String grade;
	private float perc;

	public ReportCard() {

	}

	public ReportCard(String grade, float perc) {
		this.grade = grade;
		this.perc = perc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float getPerc() {
		return perc;
	}

	public void setPerc(float perc) {
		this.perc = perc;
	}

	public void calculateGrade() {

		if (perc < 40)
			grade = "Fail";
		else if (perc >= 40 && perc < 60)
			grade = "2nd Class";
		else if (perc >= 60 && perc < 75)
			grade = "1st Class";
		else if (perc >= 75 && perc <= 100)
			grade = "Distinction";
		else
			grade = "Invalid Grade";
	}

	public void printReportCard() {
		System.out.println("Grade = " + grade);
		System.out.println("Percentage = " + perc);
	}
}
