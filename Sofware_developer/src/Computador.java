public class Computador {

    String nome;
    String marca;
    double preco;
    int memoriaRam;
    int espacoHD;
    String processador;
    boolean placaDeVideoDedicada;

    public static void main(String[] args) {

        // Computador 1
        Computador pc1 = new Computador();
        pc1.nome = "PC Gamer";
        pc1.marca = "Dell";
        pc1.preco = 5500.00;
        pc1.memoriaRam = 16;
        pc1.espacoHD = 1000;
        pc1.processador = "Intel i7";
        pc1.placaDeVideoDedicada = true;

        // Computador 2
        Computador pc2 = new Computador();
        pc2.nome = "Notebook Trabalho";
        pc2.marca = "Lenovo";
        pc2.preco = 3200.00;
        pc2.memoriaRam = 8;
        pc2.espacoHD = 512;
        pc2.processador = "Intel i5";
        pc2.placaDeVideoDedicada = false;

        // Computador 3
        Computador pc3 = new Computador();
        pc3.nome = "PC Básico";
        pc3.marca = "HP";
        pc3.preco = 2000.00;
        pc3.memoriaRam = 4;
        pc3.espacoHD = 500;
        pc3.processador = "Intel i3";
        pc3.placaDeVideoDedicada = false;

        // Exibindo
        System.out.println(pc1.nome + " - " + pc1.preco);
        System.out.println(pc2.nome + " - " + pc2.preco);
        System.out.println(pc3.nome + " - " + pc3.preco);
        
        Fabricante fabricante;
        
        Fabricante dell = new Fabricante();
        dell.nome = "Dell computadores";
        
        	
        
        
        
    }
}