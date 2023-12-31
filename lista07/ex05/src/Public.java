import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,pos = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vet = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		double maior = vet[0];
		for(int j = 0; j<n; j++) {
			if (vet[j] > maior) {
				maior = vet[j];
				pos = j;
			}
		}
		System.out.printf("\nMAIOR VALOR = %.2f",maior);
		System.out.printf("\nPOSICAO DO MAIOR VALOR = %d",pos);
		sc.close();
	}

}
