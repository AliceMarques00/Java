package Metodos;

public class Carros1 {
     String cor;
     String modelo;
     double valor;
     boolean estado= false;
     
     
     public Carros1() {
}
    public Carros1(String cor) {
	this.cor=cor;
}
     public Carros1(String cor, String modelo) {
    	 this.cor= cor;
    	 this.modelo= modelo;
    	
}
     public Carros1(String cor, String modelo, double valor ) {
    	 this.cor=cor;
    	 this.modelo=modelo;
    	 this.valor= valor;
     }
     String nome;
    
     boolean ligando= true;
 
     boolean Status= true;

     public void Ligar() {
       
      if (estado== false) {
    	  estado= true;
     	 System.out.printf("%s Carro ligado com sucesso",estado);
      }
    
      else {
     	 System.out.printf("%s O carro ja encontra-se desligado",estado);
      }
     }
      public void desligar() {
    	  if(estado== true) {
          estado = false;
    	  System.out.println("Carro desligado com sucesso");
     
      }  else {
    	    System.out.println("O carro está desligado");
      }
      }
      public void Status() {
    		  if(estado== true) {
    	    System.out.println("Carro ligado ");
    	     
      } else {
    	     System.out.println("O carro está desligado");
   
    	 }
}
      }
