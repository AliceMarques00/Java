package básico1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		  int num1= input.nextInt();
		System.out.println("Digite um valor: ");
		  int num2= input.nextInt();
		System.out.println("Digite um valor: ");
		  int num3= input.nextInt();
		
	
		  if(num1 > num2 && num1> num3)
				System.out.printf("num1 = %d" , num1);
			else if(num2 > num1 && num1> num3)
			    System.out.printf("num2=  %d", num2);
			else if(num3> num1 && num3> num2)
			    System.out.printf("num3= %d", num3);
			else 
			    System.out.println("São iguais");
			
		  
	}

}
