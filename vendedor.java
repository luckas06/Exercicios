package dozeEx;
import java.util.*;
public class vendedor {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		int venda;
		double salario, totalVenda,total;
		System.out.println("Digite o salário do vendedor:");
		salario=in.nextDouble();
		System.out.println("Digite o total de vendas:");
		venda=in.nextInt();
		totalVenda=0.15*venda;
		total=salario+totalVenda;
		System.out.println("O salário fixo do vendedor é:"+salario);
		System.out.println("O salário final do vendeor é:"+total);
		in.close();
	}
}
