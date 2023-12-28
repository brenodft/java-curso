import java.util.Locale;
import java.util.Scanner;
import util.User;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char yn = sc.next().charAt(0);
		User acc = new User(num,holder,yn,sc);
		acc.showAccount();
		acc.deposit(sc);
		acc.withdraw(sc);
		sc.close();
	}

}
