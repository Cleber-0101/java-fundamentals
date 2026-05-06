


import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		//Entrada de dados do usuario!
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int x;
		x = scanner.nextInt();
		
		
		// next = tipo string
		// nextint = tipo int
		//nextDouble alem do mais ele busca a localidade do sistema  
		
		
		System.out.println("Voce digitou maria: " + x);
		
		scanner.close();
	}

}