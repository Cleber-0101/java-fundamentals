package POO;


//Instanciando a Classe 
public class App {
	public static void main(String[] args) {
		
		//Primeira instanciação da Classe Computador
		Computador pc = new Computador();
		
		//Dessa forma eu crio de acordo com a variavel um Objeto
		pc.modelo = "G5";
		pc.marca = "Dell";
		pc.espacoHD = 256;
		pc.memoriaRam = 8;
		pc.placaDevideoDedicado = true;
		pc.processador = "17";
		pc.preco = 5200.50;
		
		Fabricante dell = new Fabricante();
		dell.nome = "Dell Computadores";
		dell.endereco = "Avenida Paulista";
		
		pc.fabricante = dell;
		
		//Segunda Instancia da Classe computador
		Computador notebook = new Computador();
		
		//Dessa forma eu crio de acordo com a variavel um Objeto
		notebook.modelo = "MacBook Pro";
		notebook.marca = "Apple";
		notebook.placaDevideoDedicado = false;
		notebook.espacoHD = 512;
		notebook.memoriaRam = 16;
		notebook.processador = "15";
		notebook.preco = 1599.99;
		
		Fabricante apple = new Fabricante();
		apple.nome = "Apple";
		apple.endereco = "Av Pàulista 500";
		
		notebook.fabricante = apple;
		
	}
}
