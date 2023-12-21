import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		do {
		senha = sc.nextInt();
		if (senha == 2002) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Senha Invalida.");
		}
		}while (senha != 2002);
		sc.close();
	}

}
