package exerciciosCaderno;
import java.util.*;
public class temperatura {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int t;
		System.out.println("Escreva a temperatura");
		t=in.nextInt();
		if (t<15) {
			System.out.println("Frio");
		}else if (t>=22) {
			System.out.println("Quente");
		}else {
			System.out.println("Amenua");
		}in.close();
	}
}
