package noveExercicios;
import java.util.*;
public class TipoTriangulo {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double a, b, c;
		System.out.println("Digite o primeiro valor");
		a=in.nextDouble();
		System.out.println("Digite o segundo valor");
		b=in.nextDouble();
		System.out.println("Diigite o terceiro valor");
		c=in.nextDouble();
		if (a>b+c) {
			System.out.println("Não é um triângulo");
		}else if (a==b && a==c && c==b) {
			System.out.println("É um triângulo equilátero");
		}else if (a!=b && a!=c && b!=c) {
			System.out.println("É um triângulo escaleno");
		}else {
			System.out.println("É um triângulo isóceles");
			in.close();
		}
	}
}
