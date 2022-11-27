package Exercicios;
import java.util.*;
public class DataNasc {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int anoUsuario, anoAtual, idade;
		System.out.println("Digite seu ano de nascimento");
		anoUsuario = in.nextInt();
		System.out.println("Digite o ano atual");
		anoAtual = in.nextInt();
		idade = anoAtual - anoUsuario;
		System.out.println("A sua idade é "+idade);
		in.close();
	}
}
