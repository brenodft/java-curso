import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b,c,t,pi = 3.14159,cc,tr,q,ret;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		t = (a*c)/2;
		cc = pi*c*c;
		tr= (a+b)*c/2;
		q = b*b;
		ret = a*b;
		System.out.printf("TRIANGULO: %.3f%n",t);
		System.out.printf("CIRCULO: %.3f%n",cc);
		System.out.printf("TRAPEZIO: %.3f%n",tr);
		System.out.printf("QUADRADO: %.3f%n",q);
		System.out.printf("RETANGULO: %.3f%n",ret);
		sc.close();
	}

}
