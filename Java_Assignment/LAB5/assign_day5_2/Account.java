package assign_day5_2;

public class Account {
	float balance;
	
	public Account() {

	}

	public Account(float balance) {
		this.balance = balance;
	}

	public void deposit(float amt) {
		balance += amt;
	}

	public void withdraw(float amt) throws BigAmountException {

		if (amt > 15000) {
			throw new BigAmountException(1,"There is a withdraw error");
		} else if (amt > balance) {
			throw new BigAmountException(0,"Insufficient Balance");
		}
		balance -= amt;
	}

	public void print() {
		System.out.println("balance after= " + balance);
	}
}
