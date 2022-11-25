package dozeEx;
import java.util.*;
public class diaMesAno {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int dia, mes, ano;
		System.out.println("Digite o número de dias:");
		dia=in.nextInt();
		mes=dia/30;
		ano=mes/12;
		System.out.println("O número de meses é:"+mes);
		System.out.println("O número de anos é:"+ano);
		in.close();
	}

}
