import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),n1,n2;
		double div;
		for(int i = 0 ;i<N; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if(n2 != 0) {
				div = (double)n1/n2;
				System.out.println(div);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}

}
