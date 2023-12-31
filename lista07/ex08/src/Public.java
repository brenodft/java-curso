import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt(),qtdpar=0,mediapar = 0;
		int[] vet = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			if(vet[i] %2 == 0) {
				qtdpar++;
				mediapar+= vet[i];
			}
		}
		if (qtdpar > 0) {
			mediapar = mediapar/qtdpar;
			System.out.println("MEDIA DOS PARES = "+mediapar);
		} else {
			mediapar = 0;
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
