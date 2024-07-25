package REP1;

public class Exercicio6 {

	public static void main(String[] args) {
		System.out.println("Números pares:");
		int num= 1;
		while (num <=100){
		
			if(num  % 2==0) {
			   System.out.print(num + " ");
			}
			num++;
		}
		System.out.println("\nNúmeros ímpares:");
		int num2= 1;
		while (num2 <=100){
		
			if(num2  % 2!=0) {
			   System.out.print(num2 + " ");
			}
			num2++;
		}
}
}