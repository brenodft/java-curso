import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double dolarprice,dolarbought,result;
		System.out.println("What is the dollar price? ");
		dolarprice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		dolarbought = sc.nextDouble();
		result = CurrencyConverter.bepaid(dolarprice,dolarbought);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		sc.close();
	}

}
