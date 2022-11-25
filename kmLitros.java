package dozeEx;
import java.util.*;
public class kmLitros {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double km, gas, media;
		System.out.println("Digite a distância percorrida");
		km=in.nextDouble();
		System.out.println("Digite o combústivel gasto");
		gas=in.nextDouble();
		media=km/gas;
		System.out.println("o consumo médio dessa viagem é:"+media);
		in.close();
	}
}
