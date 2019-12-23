package Employee_inheritence;

public class Employee {
	String name;
	String id;
	float totalSalary;

	public Employee() {

	}

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void print() {
		System.out.println("Employee Name= " + name);
		System.out.println("Employee ID= " + id);
		System.out.println("Total Salary= " + totalSalary);
	}

	public void calcSal() {

	}

}
