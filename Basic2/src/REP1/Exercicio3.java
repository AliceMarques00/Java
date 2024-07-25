package REP1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Escreva um programa que pergunte ao usuario quantos alunos tem na sala dele. Em seguida,através de 
		// um laço while, pede ao usuario para que digite as notas de todos os alunos, um por vez
		
		//por fim, o programa mostra a média aritmetica, da turma
		    int alunos, totalalunos;
		    double nota=0, soma=0, media=0;
		    
			Scanner input = new Scanner(System.in);

			System.out.print("Quantos alunos tem na sala? ");
			
			alunos= input.nextInt();
			totalalunos= alunos ;
			
			while(alunos>0) {
				System.out.println("Informe a nota: ");
				nota= input.nextDouble();
				soma= soma+ nota;
				alunos--;
			}
			media= soma/totalalunos;
			System.out.printf(" A média da turma é %.2f",media );
			
			
			
		
			
			
		

	}

}
