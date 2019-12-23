package Employee_inheritence;

public class Contract_Employee extends Employee {

	float noHours;
	float perHour;

	public Contract_Employee() {

	}

	public Contract_Employee(String name, String id, float noHours, float perHour) {
		super(name, id);
		this.noHours = noHours;
		this.perHour = perHour;
	}

	public void calcSal() {
		totalSalary = noHours * perHour;
	}

	public void print() {
		super.print();
		System.out.println("Contract Employee");
		System.out.println("Numer of Hours= " + noHours);
		System.out.println("Pay per Hour= " + perHour);
		System.out.println();
	}

}
