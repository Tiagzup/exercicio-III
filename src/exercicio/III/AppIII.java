package exercicio.III;

import java.util.Scanner;

public class AppIII {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite um número maior");
		double numeroMaior = entrada.nextDouble();
		
		System.out.println("Digite um número menor");
		double numeroMenor = entrada.nextDouble();
		
		
		double diferença = (numeroMaior - numeroMenor);
		
		System.out.println(" A diferença do numero maior para o menor é  " + diferença);
		
		
		
		
		

	}

}
