package Exercicios;
import java.util.*;
public class Crescente {
	public static void main (String[]args) {
		Scanner in =new Scanner (System.in);
		int a, b, c, gX, nX, pX;
		System.out.println("Digite o primeiro valor");
		a=in.nextInt();
		System.out.println("Digite o segundo valor");
		b=in.nextInt();
		System.out.println("Digite o terceiro valor");
		c=in.nextInt();
		if (a>b && a>c) {
			gX=a;
		}else if (b>a && b>c) {
			gX=b;
		}else {
			gX=c;
		}
		if (a<b && a<c) {
			pX=a;
		}else if (b<a && b<c) {
			pX=b;
		}else {
			pX=c;
		}
		if (a<gX && a>pX) {
			nX=a;
		}else if (b<gX && b>pX) {
			nX=b;
		}else {
			nX=c;
		}
		System.out.println(pX);
		System.out.println(nX);
		System.out.println(gX);
		in.close();
	}
}
