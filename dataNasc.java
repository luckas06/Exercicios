package dozeEx;
import java.util.*;
public class dataNasc {
	public static void main (String arg []) {
		Scanner in=new Scanner (System.in);
		int anoUsuario, anoAtual, idade;
		System.out.println("Digite seu ano de nascimento:");
		anoUsuario=in.nextInt();
		System.out.println("Digite o ano atual:");
		anoAtual=in.nextInt();
		idade=anoAtual-anoUsuario;
		System.out.println("A idade é:"+idade);
		in.close();
	}
}
