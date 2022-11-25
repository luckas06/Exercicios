package dezDeJunho;
import java.util.*;
public class tituloEleitor {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int nasc, atual, idade;
		System.out.println("Escreva seu ano de nascimento:");
		nasc=in.nextInt();
		System.out.println("Escreva o ano atual:");
		atual=in.nextInt();
		idade=atual-nasc;
		if(idade<16) {
			System.out.println("Não pode tirar o título de eleitor");
		}else {
			System.out.println("Pode tirar o título de elitor");
		}in.close();
	}
}
