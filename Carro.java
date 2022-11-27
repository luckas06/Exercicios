package Exercicios;
import java.util.*;
public class Carro {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double km, l, gM;
		System.out.println("Digite o valor percorrido");
		km=in.nextDouble();
		System.out.println("Digite a capacidade do tanque");
		l=in.nextDouble();
		gM=km/l;
		if (gM>=10) {
			System.out.println("Econômico");
		}else {
			System.out.println("Não econômico");
			in.close();
		}
	}
}
