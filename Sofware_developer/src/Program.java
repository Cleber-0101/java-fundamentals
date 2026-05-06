
public class Program {
	
    public static void main(String[] args) {
    	
        String original = " abcd FGHIJ ABC abc DEFG    ";
        
        String menor = original.toLowerCase();
        String maior = original.toUpperCase();
        String espacoesFrase = original.trim();
        String pegandoDadoQuebradosDaFrase = original.substring(2);
        String pegandoDadoQuebradosDaFrase2 = original.substring(2,9);
        
        System.out.println(menor);
        System.out.println(maior);
        System.out.println(espacoesFrase);
        System.out.println(pegandoDadoQuebradosDaFrase);
        System.out.println(pegandoDadoQuebradosDaFrase2);
      
    }
    
}