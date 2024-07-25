package Basic3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double notas[]= new double[5];
        double soma=0, media=0;
  

    for(int x =0; x<5; x++){
	   System.out.println("Digite a nota");
	   notas[x] = input.nextDouble();
  }
    for (double n:notas) {
    	soma+=n;
    }
     media =soma/notas.length;
    System.out.printf("A média da turma é %.2f", media);
  }
  
  }
   
  