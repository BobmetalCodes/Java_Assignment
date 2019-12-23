package assign_day5_2;

public class BigAmountException extends Exception {

	int flag;

	public BigAmountException() {

	}

	public BigAmountException(int flag, String errorMsg) {
		super(errorMsg);
		this.flag = flag;
	}

	public void printStackTrace() {
		System.out.println("Printing Stack Trace");
		super.printStackTrace();
	}

	public void printException() {
		if (flag == 1)
			System.out.println("Exception caused by Amount > 15000");
		else
			System.out.println("Exception caused by Amount>Balance");

	}

}
