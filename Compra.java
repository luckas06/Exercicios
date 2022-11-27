package Exercicios;
import java.util.*;
public class Compra {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		double c[], m, mc=0, st=0;	
		int i;
		
		c = new double [5];
		
		for (i=0; i<5; i++) {
			System.out.println("Digite o valor da "+(i+1)+"ª compra");
			c[i] = in.nextDouble();
			
		}
		for (i=0; i<5; i++) {
			st = st + c[i];			
		}
		m = st/5;
		for (i=0; i<5; i++) {
			if (mc<c[i]) {
				mc = c[i];
			}
		}
		if (st<=150) {
			System.out.println();
			System.out.println("O valor total da compra será de "+st+"R$");
			System.out.println("O produto mais caro custa "+mc+"R$");
			System.out.println("A média do valor dos produtos é de "+m+"R$");
		}else {
			System.out.println();
			System.out.println("O valor total da compra será de "+st+"R$, dinheiro insuficiente");
			System.out.println("O produto mais caro custa "+mc+"R$");
			System.out.println("A média do valor dos produtos é de "+m+"R$");
		}
		
		
	}
	
	
}
