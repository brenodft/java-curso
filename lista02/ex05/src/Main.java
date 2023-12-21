import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt(),multiplicador = sc.nextInt();
		double preco = 0.00;
		if(codigo == 1) {
			preco = 4.00 * multiplicador;
		}else if(codigo == 2) {
			preco = 4.50 * multiplicador;
		}else if(codigo == 3) {
			preco = 5.00 * multiplicador;
		}else if(codigo == 4) {
			preco = 2.00 * multiplicador;
		}else if(codigo == 5) {
			preco = 1.50 * multiplicador;
		}else {
			System.out.println("CODIGO INVALIDO");
		}
		System.out.printf("Total: R$ %.2f",preco);
		sc.close();
	}

}
