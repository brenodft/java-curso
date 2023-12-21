import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),incount = 0,outcount = 0,valor;
		for(int i = 0; i < N; i++) {
			valor = sc.nextInt();
			if(valor>=10 && valor<= 20) {
				incount++;
			}else {
				outcount++;
			}
		}
		System.out.println(incount + " in");
		System.out.println(outcount + " out");
		sc.close();
	}

}
