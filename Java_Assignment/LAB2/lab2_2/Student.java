/*******Student Grade Constructors******/

package lab2_2;

public class Student {

	private int id;
	private String name;
	private float percentage;
	private String grade;

	public Student() {

	}

	public Student(int id, String name, float percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
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

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	void grade_calc() {
		if (percentage < 40) {
			grade = "FAIL";
		}

		else if (percentage >= 40 && percentage < 60) {
			grade = "2nd CLASS";
		}

		else if (percentage >= 60 && percentage < 75) {
			grade = "1st CLASS";
		}

		else if (percentage >= 75 && percentage <= 100) {
			grade = "DISTINCTION";
		} else {
			grade = "Invalid percentage. No Grade.";
		}
	}

	void print() {
		grade_calc();
		System.out.println("id= " + id);
		System.out.println("name= " + name);
		System.out.println("percentage= " + percentage);
		System.out.println("grade= " + grade);
		System.out.println("***************************\n");
	}

}
