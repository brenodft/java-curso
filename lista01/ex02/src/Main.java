import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double raio,area,pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		area = pi*raio*raio;
		System.out.printf("A = %.4f%n",area);
		sc.close();
	}

}
