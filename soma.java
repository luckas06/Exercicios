package dozeEx;
import java.util.*;
public class soma {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double soma, a, b;
		System.out.println("Digite um valor:");
		a=in.nextDouble();
		System.out.println("Digite outro valor:");
		b=in.nextDouble();
		soma=a+b;
		System.out.println("A soma entre esses valores é:"+soma);
		in.close();
	}
}
