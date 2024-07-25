package Encapsulamento;

public class Pet {
	private	String nome;
	private String tipo;
	private String tamanho;
	private String padrinho;
	private String signo;
	private String cor;
	private Double peso;
	

	  public void AjustarNome(String nome) {
		  this.nome=nome;
	  }
	public String lerNome() {
		return this.nome;
	}
	 public void AjustarTipo(String tipo) {
		  this.tipo=tipo;
	  }
	public String lerTipo() {
		return this.tipo;
	}
	 public void AjustarTamanho(String tamanho) {
		  this.tamanho=tamanho;
	  }
	public String lerTamanho() {
		return this.tamanho;
	}
	public void AjustarPadrinho(String padrinho) {
		  this.padrinho=padrinho;
	  }
	public String lerPadrinho() {
		return this.padrinho;
	}
	public void AjustarSigno(String signo) {
		  this.signo=signo;
	  }
	public String lerSigno() {
		return this.signo;
}
	public void AjustarCor(String cor) {
		 this.cor= cor;
}
	public String lerCor() {
		return this.cor;
}
	public void AjustarPeso(double peso) {
		 this.peso=peso;
}
	public Double lerPeso() {
		return this.peso;
}
}