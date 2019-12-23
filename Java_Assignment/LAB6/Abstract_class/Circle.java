package Abstract_class;

public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	public void findArea() {
		area = 3.14f * radius * radius;
	}

	public void printCircle() {
		System.out.println("Radius= " + radius);
		super.printShape();
	}

}
