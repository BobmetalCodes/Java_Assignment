package lab2_banking;

public class Banking {

	private double amount;
	private double balance;

	void deposit(double add) {

		amount += add;
	}

	void withdraw(double sub) {
		if (amount >= sub) {
			amount -= sub;
		} else
			System.out.println("Account balance Insufficient");
	}

	void print() {
		System.out.println("Current Balance in account = " + balance);
	}

}
