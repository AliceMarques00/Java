package básico1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		
		int valor= input.nextInt();
		
		
		if(valor > 0)
			System.out.println("Positivo");
		else if(valor == 0)
		    System.out.println("Neutro");
		else
			System.out.println("Negativo");
		
		
	


	}

}
