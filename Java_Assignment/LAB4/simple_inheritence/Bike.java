package simple_inheritence;

public class Bike extends Vehicle {

	float engine_cc;

	public Bike() {

	}

	public Bike(String name, String color, float speed, float engine_cc) {
		super(name, color, speed);
		this.name = name;
		this.color = color;
		this.engine_cc = engine_cc;
		this.speed = speed;
	}

	public void print() {
		super.print();
		System.out.println("Engine size= " + engine_cc + "cc");
	}
}
