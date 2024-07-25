package Basic3;

import java.util.Arrays;

public class Exercicio5 {

	public static void main(String[] args) {
		int a[]= {81,25,34,17,50,64};
		for(int i= a.length -1; i>=0 ; i--) {
			System.out.print(a[i]+ " ");
		}
		{
		 int b[] = new int[a.length];
		 
		 for(int i= 0; i < a.length; i++){
		  b[i]= a[i];
		}
        for(int i= b.length- 1; i>=0; i--) {
        	System.out.print(b[i] + " ");
        }
		}

        Arrays.sort(a);
        
        for (int val : a) {
            System.out.print(val + ", ");
}
    }
}