package Metodos;

public class calculadora {

	public static void main(String[] args) {
		
		CalcularMetodos cal= new CalcularMetodos();
		int soma1 = cal.somar(1,3);
		double soma2= cal.somar(333,22,1);
		double Subtracao= cal.sub(2,3);
		double Subtracao2= cal.sub(2, 4,5);
		double multiplicacao= cal.mult(8,9);
		double multiplicacao2= cal.mult(8,9,6);
		double divisao= cal.div(88,4);
		double divisao2= cal.div(88,4,8);
		
		System.out.println(soma1);
		System.out.println( soma2);
		System.out.println(Subtracao);
		System.out.println(Subtracao2);
		System.out.println(multiplicacao);
		System.out.println(multiplicacao2);
		System.out.println(divisao);
		System.out.println(divisao2);
	

	}

}
