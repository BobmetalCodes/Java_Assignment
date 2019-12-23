package lab1;

public class Employee {

	int id;
	String name;
	float basicSalary;
	float totalSalary;
	float hra;
	float da;

	void calculate(float bs) {
		hra = 0.18f * (bs);
		da = 0.20f * (bs);
		totalSalary = hra + da + bs;
	}

	void print() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("basic salary=" + basicSalary);
		System.out.println("hra=" + hra);
		System.out.println("da=" + da);
		System.out.println("total salary=" + totalSalary);
		System.out.println("***************************\n");
	}
}
