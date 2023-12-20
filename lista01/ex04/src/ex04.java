import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int num,hr;
		double valor,salario;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		hr = sc.nextInt();
		valor = sc.nextDouble();
		salario = hr*valor;
		System.out.println("NUMBER = "+num);
		System.out.println("SALARY = U$ "+salario);
		sc.close();

	}

}
