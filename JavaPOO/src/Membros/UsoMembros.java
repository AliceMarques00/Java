package Membros;

public class UsoMembros {

	public static void main(String[] args) {
		DataNascimento dt= new DataNascimento();
		DataNascimento dt2= new DataNascimento();
		
		dt.dia=24;
		dt.mes=12;
		dt.ano=2005;
		
		dt2.dia=25;
		dt2.mes=06;
		dt2.ano=2004;
		
		System.out.printf("A data de Nascimento " + "é %d %d %d \n", dt.dia, dt.mes, dt.ano);
		
		System.out.printf("A data de Nascimento "+ "é %d %d %d", dt2.dia, dt2.mes, dt2.ano);
		
		
	}

}
