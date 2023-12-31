import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		System.out.println("Digite os valores do vetor A: ");
		int[] vet1 = new int[n];
		int[] vet2 = new int[n];
		int[] vet3 = new int[n];
		for(int i = 0; i<n; i++) {
			vet1[i]= sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int j =0; j<n; j++) {
			vet2[j] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for(int k = 0; k<n; k++) {
			vet3[k] = vet1[k] + vet2[k];
			System.out.println(vet3[k]);
		}
		sc.close();
	}

}
