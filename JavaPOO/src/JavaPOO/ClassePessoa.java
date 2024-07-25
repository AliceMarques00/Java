package JavaPOO;


public class ClassePessoa {
String nome;
boolean comendo = true;
boolean andando = true;

public void comer() {
  
 if (comendo= true) {
	 System.out.printf("%s pode comer",nome);
 }
 else {
	 System.out.printf("%s Não está comendo",nome);
 }
}
public void andar() {
	 if(andando==true) {
		 System.out.printf("%s Pode andar",nome);
	 }
	 else {
		 System.out.printf("%s Não está andando");
	 }
}
public void pararAndar() {
	if(comendo== true)
	System.out.printf("%s Não pode andar, pois está comendo",nome);
	
}

public void pararComer() {
	if(andando==true)
	System.out.printf("%s Não pode comer, pois está andando", nome);




}

}
