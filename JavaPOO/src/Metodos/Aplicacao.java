package Metodos;

import JavaPOO.ClassePessoa;

public class Aplicacao {

	public static void main(String[] args) {
		Carros1 c1 = new Carros1();
		Carros1 c2= new Carros1("Azul");
		
	    c1.cor = "Azul";
	    c1.modelo="Fusca";
	    c1.valor= 55000;
	    		
	    System.out.printf("O modelo: %s a cor é %s e custa %f",c1.cor,c1.modelo, c1.valor);
	    System.out.println();
	    
	    Carros1 c3 = new Carros1();
	    c3.cor="Branco";
		c3.modelo="Palio";
		c3.valor= 24.046;
		System.out.printf("O modelo: %s a cor é %s e custa %f",c3.cor,c3.modelo, c3.valor);
		System.out.println();
		
	    Carros1 c4= new Carros1();
	    c4.cor="Vermelho";
	    c4.modelo="Jeep";
	    c4.valor=50000.000;
	    System.out.printf("O modelo: %s a cor é %s e custa %f",c4.cor,c4.modelo, c4.valor);
	    System.out.println();
	    
	    c1.Status();
	    c1.Ligar();
	    System.out.println();
	    c1.desligar();
	    
	}
	 
	
	

}

