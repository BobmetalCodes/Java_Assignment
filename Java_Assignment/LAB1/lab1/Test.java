package lab1;

public class Test {
	public static void main(String[] args) {

		Employee e = new Employee();
		Employee f = new Employee();
		e.id = 123;
		e.name = "John Doe";
		e.basicSalary = 30000;

		f.id = 456;
		f.name = "Jane Doe";
		f.basicSalary = 60000;

		e.calculate(e.basicSalary);
		f.calculate(f.basicSalary);
		e.print();
		f.print();
	}

}
