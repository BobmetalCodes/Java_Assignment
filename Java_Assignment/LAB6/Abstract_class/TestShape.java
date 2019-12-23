package Abstract_class;

public class TestShape {
	public static void main(String[] args) {
		Shape s1 = new Circle("Circle", 5.45f);
		Shape s2 = new Square("Square", 6f);
		s1.findArea();
		s1.printShape();
		s2.findArea();
		s2.printShape();
	}

}
