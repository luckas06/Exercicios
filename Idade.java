package Exercicios;
import java.util.*;
public class Idade {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int idade, nasc, atual;
		System.out.println("Digite o ano atual");
		atual=in.nextInt();
		System.out.println("Digite seu ano de nascimento");
		nasc=in.nextInt();
		idade=atual-nasc;
		System.out.println("Sua idade é"+idade);
		if (idade<=10) {
			System.out.println("Criança");
		}else if (idade<=18) {
			System.out.println("Adolescente");
		}else if (idade<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		in.close();
		}
	}
}
