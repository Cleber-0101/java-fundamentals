public class FiapOn {
	public static void main(String[] args) {

		String escola1 = "fiap";
		// String escola2 = "fiap";
	
		// String Pool:
		// "fiap" (escola1) fica no pool de Strings (área otimizada de memória)
		
		// Criamos um NOVO objeto na memória heap com o mesmo valor ("fiap")
		// Por isso, usando (==) seria false, pois são objetos diferentes na memória
		String escola2 = new String("fiap");
		
		// equals() compara o VALOR (conteúdo da String), não a referência
		boolean isIqual = (escola1.equals(escola2));
		
		System.out.println("Escola é = " + isIqual); // true
		
	}
}