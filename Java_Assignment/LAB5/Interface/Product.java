package Interface;

public class Product {

	String name;

	public Product() {

	}

	public Product(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("Name= " + name);
	}
}
