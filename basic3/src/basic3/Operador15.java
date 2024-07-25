package basic3;

import java.util.Scanner;

import java.util.StringTokenizer;

public class Operador15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva qualquer coisa: ");
		
		StringTokenizer e = new StringTokenizer(input.nextLine());
		
		System.out.println(e.countTokens());
		
	}
	
  
}
