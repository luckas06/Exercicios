package Exercicios;
import java.util.*;
public class Ipva {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double veiculo, ipva;
		System.out.println("Digite o valor do veículo:");
		veiculo = in.nextDouble();
		ipva = 0.04 * veiculo;
		System.out.println("O valor do IPVA será de "+ipva);
		in.close();
	}
}
