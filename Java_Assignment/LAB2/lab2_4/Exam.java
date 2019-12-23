package lab2_4;

public class Exam {
	private String examName;
	private float totalMarks;
	private float duration;

	public Exam() {

	}

	public Exam(String examName, float totalMarks, float duration) {
		this.examName = examName;
		this.totalMarks = totalMarks;
		this.duration = duration;
	}

	void print() {
		System.out.println("Exam: " + examName);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Duration: " + duration);
		System.out.println("************************");
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

}
