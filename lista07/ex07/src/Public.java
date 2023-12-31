import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		double media = 0;
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			media += vet[i];
		}
		media = media/n;
		System.out.println("MEDIA DO VETOR = "+media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int j = 0; j<n; j++) {
			if (vet[j] < media) {
				System.out.println(vet[j]);
			}
		}
		sc.close();

	}

}
