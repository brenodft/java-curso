import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),fat = 1;
		if(N == 0) {
			System.out.println(fat);
		}else {
			for(int i = N; i>0; i--) {
				fat = fat*i;
			}
			System.out.println(fat);
		}
		sc.close();
	}

}
