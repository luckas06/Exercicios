package dozeEx;
import java.util.*;
public class ValoresTrocados {
	public static void main (String arg[]){
		Scanner in=new Scanner (System.in);
		int a, b, c;
		System.out.println("Digite o valor A:");
		a=in.nextInt();
		System.out.println("Digite o valor B:");
		b=in.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("O valor de A é:"+a);
		System.out.println("O valor de B é:"+b);
		in.close();
	}

}
