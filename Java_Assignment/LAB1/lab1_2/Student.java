package lab1_2;

public class Student {
	int id;
	String name;
	float percentage;
	String grade;

	void grade_calc(float perc) {
		if (perc < 40) {
			grade = "FAIL";
		}

		else if (perc >= 40 && perc < 60) {
			grade = "2nd CLASS";
		}

		else if (perc >= 60 && perc < 75) {
			grade = "1st CLASS";
		}

		else if (perc >= 75 && perc <= 100) {
			grade = "DISTINCTION";
		} else {
			grade = "Invalid percentage. No Grade.";
		}
	}

	void print() {
		System.out.println("id= " + id);
		System.out.println("name= " + name);
		System.out.println("percentage= " + percentage);
		System.out.println("grade= " + grade);
		System.out.println("***************************\n");
	}
}
