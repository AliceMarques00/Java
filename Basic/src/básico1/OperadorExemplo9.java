package básico1;

import java.util.Scanner;

public class OperadorExemplo9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		System.out.print("Digite seu nome: ");
		nome= input.nextLine();
		System.out.print("Digite a sua idade: ");
		idade= input.nextInt();
		
		System.out.println("Nome: "+nome+ " "+ "Idade: "+ idade);
		System.out.printf("Nome: %s idade: %d", nome, idade);


	}

}
