package Abstract_class;

public class Square extends Shape {

	float side;

	public Square() {

	}

	public Square(String name, float side) {
		super(name);
		this.side = side;
	}

	public void findArea() {
		area = side * side;
	}

	public void printSquare() {
		System.out.println("Side= " + side);
		super.printShape();
	}

}
