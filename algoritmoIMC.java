package listaDois;
import java.util.*;
public class algoritmoIMC {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		double altura, peso, imc;
		System.out.println("Digite sua altura:");
		altura=in.nextDouble();
		System.out.println("Digite seu peso:");
		peso=in.nextDouble ();
		imc=peso/(altura*altura);
		System.out.println("Seu IMC é:"+imc);
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
		}else if (imc<25){
			System.out.println("Peso normal");
		}else if (imc<30) {
		System.out.println("Excesso de peso");
		}else if (imc<35){
			System.out.println("obesidade grau 1");
		}else if(imc<40) {
			System.out.println("Obesidade grau 2");
		}else if (imc>40) {
			System.out.println("Obesidade grau 3");
			in.close();
		}
	}
}
