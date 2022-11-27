package Exercicios;
import java.util.*;
public class SomaQuadrados {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double a, b, c, qa, qb, qc, soma;
		System.out.println("Digite o primeiro valor:");
		a = in.nextDouble();
		System.out.println("Digite o segundo valor:");
		b = in.nextDouble();
		System.out.println("Digite o terceiro valor:");
		c = in.nextDouble();
		qa = a * a;
		qb = b * b;
		qc = c * c;
		soma = qa + qb + qc;
		System.out.println("A soma dos quadrados é "+soma);
		in.close();
	}

}
