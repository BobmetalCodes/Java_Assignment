package lab2_3;

public class PerimeterFinder {
	private int side;
	private float radius;
	private int length;
	private int breadth;
	private int sq_perimeter;
	private float circumference;
	private int rec_perimeter;

	public PerimeterFinder() {

	}

	public void findPerimeter(int side) {
		sq_perimeter = side * 4;
	}

	public void findPerimeter(float radius) {
		circumference = 2 * 3.14f * radius;
	}

	public void findPerimeter(int length, int breadth) {
		rec_perimeter = 2 * length + 2 * breadth;
	}

	void print() {
		findPerimeter(side);
		findPerimeter(radius);
		findPerimeter(length, breadth);

		System.out.println("Perimeter of Square = " + sq_perimeter);
		System.out.println("Circumference of Circle = " + circumference);
		System.out.println("Circumference of Rectangle = " + rec_perimeter);
		System.out.println("*********************************************");
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getSq_perimeter() {
		return sq_perimeter;
	}

	public void setSq_perimeter(int sq_perimeter) {
		this.sq_perimeter = sq_perimeter;
	}

	public float getCircumference() {
		return circumference;
	}

	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}

	public int getRec_perimeter() {
		return rec_perimeter;
	}

	public void setRec_perimeter(int rec_perimeter) {
		this.rec_perimeter = rec_perimeter;
	}

}
