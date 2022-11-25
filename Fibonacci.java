package Classicos;
import java.util.*;
public class Fibonacci {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a=1, b=1, c, i, n;
		System.out.println("Digite um número");
		n = in.nextInt();
		for (i=1; i<=n; i++){
			c = a + b;
			b = a;
			a = c;
			System.out.println(c);
		}
	}
}
