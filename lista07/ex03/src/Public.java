import java.util.Locale;
import java.util.Scanner;

import util.Pessoa;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,idade;
		double altura,media = 0,under16 = 0;
		String nome;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[n];
		for(int i = 0; i<n; i++) {
			System.out.printf("\nDados da %d pessoa: ",i+1);
			System.out.print("\nNome: ");
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			sc.nextLine();
			media += altura;
			if (idade < 16) {
				under16++;
			}
			pessoas[i] = new Pessoa(nome,idade,altura);
		}
		under16 = (under16/n)*100;
		media = media/n;
		System.out.printf("\nAltura media: %.2f", media);
		System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n",under16);	
		for(int j = 0; j<n; j++) {
			if (pessoas[j].getAge()<16) {
				pessoas[j].printName();
			}
		}
		sc.close();
	}

}
