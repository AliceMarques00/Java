package Basic3;

public class exercicio2 {

	public static void main(String[] args) {
		int[] arrayNum= {87,68,52,5,49,83,12,64};
		int total=0;
		
		//Adciona o valor de cada elemento no total
		
		for (int i: arrayNum) {
			total+= i;
		
		System.out.printf("Total de elementos em uma arrayNum: %d\n",total);
	}

}
}