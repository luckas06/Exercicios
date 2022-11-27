package Exercicios;
import java.util.*;
public class FaixaEtaria2 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int idade[], i, n, pa, pb, pc, pd, pe;
		
		idade = new int [5];
		for(i=0; i<15; i++) {
			System.out.println("Digite a "+(i+1)+"ª idade");
			n = in.nextInt();
			if (n <= 0) {
				System.out.println("Valor inválido, digite novamente");
				i--;
				System.out.println();
			}
			else if (n <= 15){
				System.out.println("Primeira faixa etária");
				idade[0] += 1;
				System.out.println();
			}
			else if (n <= 30){
				System.out.println("Segunda faixa etária");
				idade[1] += 1;
				System.out.println();
			}
			else if (n <= 45){
				System.out.println("Terceira faixa etária");
				idade[2] += 1;
				System.out.println();
			}
			else if (n <= 60){
				System.out.println("Quarta faixa etária");
				idade[3] += 1;
				System.out.println();
			}
			else if (n >= 61){
				System.out.println("Quinta faixa etária");
				System.out.println();
				idade[4] += 1;
			}
		}
		pa = (idade[0]*100)/15;
		pb = (idade[1]*100)/15;
		pc = (idade[2]*100)/15;
		pd = (idade[3]*100)/15;
		pe = (idade[4]*100)/15;
		System.out.println(pa+"% das pessoas são da primeira faixa etária que possue "+idade[0]+" pessoas");
		System.out.println(pb+"% das pessoas são da segunda faixa etária que possue "+idade[1]+" pessoas");
		System.out.println(pc+"% das pessoas são da terceira faixa etária que possue "+idade[2]+" pessoas");
		System.out.println(pd+"% das pessoas são da quarta faixa etária que possue "+idade[3]+" pessoas");
		System.out.println(pe+"% das pessoas são da quinta faixa etária que possue "+idade[4]+" pessoas");
	}
}
