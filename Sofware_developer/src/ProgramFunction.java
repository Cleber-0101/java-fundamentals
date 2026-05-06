import java.util.Scanner;

public class ProgramFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int higher = max(a, b, x);

        System.out.println("Maior número: " + higher);

        sc.close();
    }

    public static int max(int a, int b, int x) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (x > maior) {
            maior = x;
        }

        return maior;
    }
}