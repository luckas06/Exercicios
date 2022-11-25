package dozeEx;
import java.util.*;
public class quatroOperacoes {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double n1, n2, soma, sub, mult, div;
		System.out.println("Digite um valor:");
		n1=in.nextDouble();
		System.out.println("Digite outro valor:");
		n2=in.nextDouble();
		soma=n1+n2;
		sub=n1-n2;
		mult=n1*n2;
		div=n1/n2;
		System.out.println("A soma entre esse valores é:"+soma);
		System.out.println("A subtração entre esses valores é:"+sub);
		System.out.println("A mutiplicação entre esses dois valores é:"+mult);
		System.out.println("A divisão entre esses dois valores é:"+div);
		in.close();
	}
}
