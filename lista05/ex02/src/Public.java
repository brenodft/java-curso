import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func1 = new Funcionario();
		double perc;
		Locale.setDefault(Locale.US);
		System.out.println("Name: ");
		func1.nome = sc.nextLine();
		System.out.println("Gross salary: ");
		func1.gross = sc.nextDouble();
		System.out.println("Tax: ");
		func1.tax  = sc.nextDouble();
		System.out.printf("Employee: %s, $ %.2f", func1.nome,func1.net());
		System.out.println("\nWhich percentage to increase salary? ");
		perc = sc.nextDouble();
		System.out.printf("Updated data: %s, $ %.2f", func1.nome,func1.increase(perc));
		sc.close();
	}

}
