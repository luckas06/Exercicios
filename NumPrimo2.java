package Exercicios;
import java.util.*;
public class NumPrimo2 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double i, n, a=0;
	
		System.out.println("Digite um número");
		n = in.nextDouble();
	
		for (i=1; i<=n; i++) {
			if (n == 1) {
				a = a + 2;
			}
			else if (n%i==0) {
				a = a + 1;
			}
		}
		if (a == 2) {
			System.out.println("O número é primo");
		}else {
			System.out.println("O número não é primo");
		}
	}
}
