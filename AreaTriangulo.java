package Exercicios;
import java.util.*;
public class AreaTriangulo {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double base, altura, area;
		System.out.println ("Digite a base:");
		base=in.nextDouble();
		System.out.println("Digite a altura:");
		altura=in.nextDouble();
		area=(base*altura)/2;
		System.out.println("A área do Triângulo é:"+area);
		in.close();
	}
}
