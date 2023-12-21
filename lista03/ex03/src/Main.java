import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao,count1=0,count2=0,count3=0;
		do {
			opcao = sc.nextInt();
			switch(opcao) {
			case 1: count1++; break;
			case 2: count2++; break;
			case 3: count3++; break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: "+count1);
				System.out.println("Gasolina: "+count2);
				System.out.println("Diesel: "+count3);
				break;
			default: break;
			}
		}while(opcao != 4);
		sc.close();
	}

}
