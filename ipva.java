package dozeEx;
import java.util.*;
public class ipva {
	public static void main (String arg []) {
		Scanner in=new Scanner (System.in);
		double veiculo, ipva;
		System.out.println("Digite o valor do veículo:");
		veiculo=in.nextDouble();
		ipva=0.04*veiculo;
		System.out.println("O valor do IPVA será de:"+ipva);
		in.close();
	}
}
