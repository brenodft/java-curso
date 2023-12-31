import java.util.Locale;
import java.util.Scanner;

import util.Inquilinos;

public class Public {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serao alugados? ");
		int qtd = sc.nextInt();
		String nome,email;
		Inquilinos[] pessoas = new Inquilinos[10];
		int room;
		sc.nextLine();
		for(int i =0; i<qtd; i++) {
			System.out.printf("Aluguel #%d\n",i+1);	
			System.out.printf("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			pessoas[room] = new Inquilinos(nome, email, room);
		}
		System.out.println("Busy rooms: ");
		for(int j =0; j<10; j++) {
			if (pessoas[j] != null) {
				System.out.println(j+": "+pessoas[j].getname()+", "+pessoas[j].getmail());
			}
		}
		sc.close();
	}

}
