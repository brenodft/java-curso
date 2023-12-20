import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c,c2,n,n2;
		double v,v2,vp;
		c = sc.nextInt();
		n = sc.nextInt();
		v = sc.nextDouble();
		sc.nextLine();
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		vp = (v*n) + (v2*n2);
		System.out.printf("VALOR A PAGAR: R$ %.2f",vp);
		sc.close();
	}

}
