import java.util.Locale;

public class ProcessamentoDeDados {
	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		int x ,y,z;
		x = 10520;
		y = 20;
		z = 50;
		
		int b = (int)  x * y + z;
		
		System.out.println("Esse numero é igual a = " + b);
	 }
}