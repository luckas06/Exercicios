package listaDois;
import java.util.*;
public class algoritmoNota {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double n1, n2, media, nE, nM;
		System.out.println("Digite a primeira nota:");
		n1=in.nextDouble();
		System.out.println("Digite a segunda nota:");
		n2=in.nextDouble();
		media=(n1+n2)/2;
		System.out.println("A média é:"+media);
		if (media<3) {
			System.out.println("REPROVADO");
		}else {
		
			
		}
	}
}
