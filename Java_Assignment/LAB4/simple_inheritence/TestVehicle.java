package simple_inheritence;

public class TestVehicle {
	public static void main(String[] args) {

		Car c = new Car();

		c.name = "Civic";
		c.color = "Yellow";
		c.speed = 100;
		c.gearType = "Manual";
		c.print();
		c.accelerate();

		Car cPar = new Car("Baleno", "Blue", 80, "Automatic");
		cPar.print();
		cPar.accelerate();

		Bike b = new Bike();

		b.name = "Yamaha R15";
		b.color = "Black";
		b.speed = 120;
		b.engine_cc = 200;
		b.print();

	}

}
