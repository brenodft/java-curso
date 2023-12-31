import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] numeros = new double[n];
		sc.nextLine();
		double soma=0,media;
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
		media = soma/n;
		System.out.print("VALORES = ");
		for(int j = 0; j<n; j++) {
			System.out.printf("%.1f ", numeros[j]);
		}
		System.out.println("");
		System.out.printf("SOMA = %.2f",soma);
		System.out.printf("\nMEDIA = %.2f",media);
		sc.close();
	}

}
