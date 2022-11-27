package Exercicios;
import java.util.*;
public class Baskarah {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Digite o primeiro valor");
		a = in.nextDouble();
		System.out.println("Digite o segundo valor");
		b = in.nextDouble();
		System.out.println("Digite o terceiro valor");
		c = in.nextDouble();
		delta = (b * b) - 4 * a * c;
		System.out.println("O valor de delta é" + delta);
		if (delta < 0) {
			System.out.println("Não exixtem raízes reais");
		} else if (delta == 0) {
			x1 = (-b) / (2 * a);
			System.out.println(x1);
		} else {
			x1 = (-b + delta) / (2 * a);
			x2 = (-b - delta) / (2 * a);
			System.out.println(x1);
			System.out.println(x2);
			in.close();
		}
	}
}
