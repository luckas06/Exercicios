package dozeEx;
import java.util.*;
public class antSuc {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int n, suc, ant;
		System.out.println("Digite um número inteiro:");
		n=in.nextInt();
		ant=n-1;
		suc=n+1;
		System.out.println("O antecessor do nùmero é:"+ant);
		System.out.println("O sucessor do número é:"+suc);
		in.close();
	}
}
