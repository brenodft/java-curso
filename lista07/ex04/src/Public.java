import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num,qtd = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();
		sc.nextLine();
		int[] vet = new int[num];
		for(int i = 0; i<num; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		System.out.println("\nNUMEROS PARES:");
		for(int j = 0;j<num;j++) {
			if (vet[j] % 2 == 0) {
				System.out.printf("%d ",vet[j]);
				qtd++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d",qtd);
		sc.close();
	}

}
