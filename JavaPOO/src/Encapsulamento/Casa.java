package Encapsulamento;

public class Casa {

	public static void main(String[] args) {
		Pet c1= new Pet();
		c1.AjustarNome("Sushi");
		System.out.println(c1.lerNome());
		
		c1.AjustarTipo("Viralatinha");
		System.out.println(c1.lerTipo());
		
		c1.AjustarTamanho("Pequeno");
		System.out.println(c1.lerTamanho());
		
		c1.AjustarPadrinho("Frida");
		System.out.println(c1.lerPadrinho());
		
		c1.AjustarSigno("gemeos");
		System.out.println(c1.lerSigno());
		
		c1.AjustarCor("Cinza");
		System.out.println(c1.lerCor());
		
		c1.AjustarPeso(5.4);
		System.out.println(c1.lerPeso());

	}

}
