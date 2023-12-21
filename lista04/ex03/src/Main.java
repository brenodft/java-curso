import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double v1,v2,v3,mediap;
		for(int i = 0; i<N; i++) {
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			mediap = ((v1*2)+(v2*3)+(v3*5))/10;
			System.out.printf("%.1f",mediap);
		}
		sc.close();
	}

}
