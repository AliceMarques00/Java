package JavaPOO;

public class ClassTeste {

	public static void main(String[] args) {
		ClassePessoa aluno01= new ClassePessoa();
		ClassePessoa aluno02= new ClassePessoa();
		
		aluno01.nome="Davi";
		aluno01.comer();
		aluno01.pararComer();
		System.out.println();
		aluno01.andar();
		aluno01.pararAndar();
		
		System.out.println();
		
		aluno02.nome="Isadora";
		aluno02.comer();
		aluno02.pararComer();
		System.out.println();
		aluno02.andar();
		aluno02.pararAndar();
		
	
	}

}
