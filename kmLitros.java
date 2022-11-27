package Exercicios;
import java.util.*;
public class KmLitros {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double km, gas, media;
		System.out.println("Digite a distância percorrida");
		km = in.nextDouble();
		System.out.println("Digite o combústivel gasto");
		gas = in.nextDouble();
		media = km / gas;
		System.out.println("o consumo médio dessa viagem é "+media);
		in.close();
	}
}
