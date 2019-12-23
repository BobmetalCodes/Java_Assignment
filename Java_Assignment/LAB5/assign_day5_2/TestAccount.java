package assign_day5_2;

public class TestAccount {
	public static void main(String[] args) {

		Account a = new Account();

		a.deposit(10000f);

		try {
			a.withdraw(12000f);
		} catch (BigAmountException e) {
			// e.printStackTrace();

			e.printException();
		}

		a.print();
	}

}
