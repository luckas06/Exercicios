package dozeEx;
import java.util.*;
public class mtsKm {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double mts, km;
		System.out.println("Digite o total de metros:");
		mts=in.nextDouble();
		km=mts/1000;
		System.out.println("O valor em quilômetros é:"+km);
		in.close();
	}
}
