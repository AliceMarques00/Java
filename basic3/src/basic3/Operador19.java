package basic3;

public class Operador18 {

    public static void main(String[] args) {
        String[] str = {"A", "vida", "é", "bela"};
        
        for (String palavra : str) {
           
            String resultadoFinal = palavra.toUpperCase();  
            
     
            if (palavra.equals("bela") || palavra.equals("vida")) {
                System.out.print(resultadoFinal + " ");
            }
        }
    }
}
