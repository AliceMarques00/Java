package Basic3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		int d[] = new int[10];
		
		Scanner entrada= new Scanner(System.in);

		for (int i=0; i<10; i++) {
			System.out.println("Informe o valor: ");
			 a[i]= entrada.nextInt();
			 System.out.println(a[i]);
	}
		for (int i=0; i<10; i++) {
			System.out.println("Informe o valor: ");
			 b[i]= entrada.nextInt();
			 System.out.println(b[i]);
}
		for (int i=0; i<10; i++) {
			System.out.println("Informe o valor: ");
			c[i]= entrada.nextInt();
			System.out.println(c[i]);
	}
		for (int i=0; i<10; i++) {
			System.out.println("Informe o valor: ");
			d[i]= entrada.nextInt();
			System.out.println(d[i]);
		}
	}
}
