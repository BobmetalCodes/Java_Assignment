package Employee_inheritence;

public class Perm_Employee extends Employee {

	float base_sal;
	float hra;
	float da;

	public Perm_Employee() {

	}

	public Perm_Employee(String name, String id, float base_sal) {
		super(name, id);
		this.base_sal = base_sal;
	}

	public void calcSal() {
		hra = 0.18f * base_sal;
		da = 0.20f * base_sal;
		totalSalary = hra + da + base_sal;
	}

	public void print() {
		super.print();
		System.out.println("Permanent Employee");
		System.out.println("Base Salary=" + base_sal);
		System.out.println("HRA=" + hra);
		System.out.println("DA=" + da);
		System.out.println();
	}

}
