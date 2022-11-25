package exerciciosCaderno;
import java.util.*;
public class positivoNegativoNeutro {
	public static void main (String arg[]) {		
		Scanner in=new Scanner (System.in);
		int n1;
		System.out.println("Escreva um número:");
		n1=in.nextInt();
		if (n1==0) {
			System.out.println("O número é neutro");
		}else if (n1<0){
			System.out.println("O número é negativo");
		}else{
			System.out.println("O número é positivo");
		}in.close();
	}
}
