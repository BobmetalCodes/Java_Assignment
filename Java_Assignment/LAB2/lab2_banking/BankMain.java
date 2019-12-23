package lab2_banking;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		int choice;
		Banking e = new Banking();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("\nEnter Option\n1.Deposit\n2.Withdraw\n3.Display Balance\n4.Exit");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to Deposit");
				e.deposit(scan.nextDouble());
				break;

			case 2:
				System.out.println("Enter Amount to Withdraw");
				e.withdraw(scan.nextDouble());
				break;

			case 3:
				e.print();
				break;

			case 4:
				System.out.println("bye bye!");
				System.exit(0);
				break;

			default:
				System.out.println("wrong input");
				break;

			}
		}
	}
}
