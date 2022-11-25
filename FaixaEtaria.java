package Classicos;
import java.util.*;
public class FaixaEtaria {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int idade, a=0, b=0 ,c=0 , d=0, e=0, i, pa, pb, pc, pd, pe;
		for (i=1; i<=15; i++) {
			System.out.println("Escolha onde sua idade se encaixa:");
			System.out.println("FAIXA ETÁRIA");
			System.out.println("1 - Até 15 anos");
			System.out.println("2 - De 16 a 30 anos");
			System.out.println("3 -  De 31 a 45 anos");
			System.out.println("4 - De 46 a 60 anos");
			System.out.println("5 - Acima de 61 anos");
			System.out.println();
			idade = in.nextInt();
			switch (idade) {
				case 1 :
					System.out.println("Primeira faixa etária");
					System.out.println();
					a++;
					break;
				case 2 :
					System.out.println("Segunda faixa etária");
					System.out.println();
					b++;
					break;
				case 3 :
					System.out.println("Terceira faixa etária");
					System.out.println();
					c++;
					break;
				case 4 :
					System.out.println("Quarta faixa etária");
					System.out.println();
					d++;
					break;
				case 5 :
					System.out.println("Quinta faixa etária");
					System.out.println();
					e++;
				default :
					System.out.println("Valor não aceito, digite novamente");
					i--;
					System.out.println();
					
			}
		}
		pa = (a*100)/15;
		pb = (b*100)/15;
		pc = (c*100)/15;
		pd = (d*100)/15;
		pe = (e*100)/15;
		System.out.println(pa+"% das pessoas são da primeira faixa etária que possue "+a+" pessoas");
		System.out.println(pb+"% das pessoas são da segunda faixa etária que possue "+b+" pessoas");
		System.out.println(pc+"% das pessoas são da terceira faixa etária que possue "+c+" pessoas");
		System.out.println(pd+"% das pessoas são da quarta faixa etária que possue "+d+" pessoas");
		System.out.println(pe+"% das pessoas são da quinta faixa etária que possue "+e+" pessoas");
	}
}
