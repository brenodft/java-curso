import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dif,hinicial,hfinal;
		hinicial = sc.nextInt();
		hfinal = sc.nextInt();
		if(hfinal<hinicial) {
			dif = (hfinal-hinicial)+24;
			System.out.println("O JOGO DUROU "+dif+" HORAS");
		}else {
			dif = hfinal - hinicial;
			if(dif == 0) {
				dif = 24;
			}
			System.out.println("O JOGO DUROU "+dif+" HORAS");
		}
		sc.close();
	}

}
