package básico1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome;
		System.out.print("Digite seu nome: ");
		nome= input.nextLine();
		System.out.print("Digite sua 1 nota: ");
		  float num1= input.nextFloat();
		System.out.print("Digite sua 2 nota: ");
		  float num2= input.nextFloat();
		 
		  System.out.println((num1+num2)/2);

	}

}
