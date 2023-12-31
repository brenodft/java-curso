import java.util.Locale;
import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] vetnome = new String[num];
		int[] vetidade = new int[num];
		for(int i = 0; i<num; i++) {
			System.out.printf("Dados da %d pessoa: \n",i+1);
			System.out.print("Nome: ");
			vetnome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetidade[i] = sc.nextInt();
			sc.nextLine();
		}
		String maiornome = vetnome[0];
		int maiornum = vetidade[0];
		for(int j =0; j<num; j++) {
			if(maiornum < vetidade[j]) {
				maiornum = vetidade[j];
				maiornome = vetnome[j];
			}
		}
		System.out.printf("PESSOA MAIS VELHA: "+maiornome);
		sc.close();
	}

}
