import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("O resultado será: " + potencia(receber(),receberp()));
    }

        static int receber() {
            Scanner in = new Scanner(System.in);

            int n;
            do {
                System.out.println("Digite um numero maior que 0:");
                n = in.nextInt();
            } while (n <= 0);

            return n;
        }

    static int receberp() {
        Scanner in = new Scanner(System.in);

        int np;
        do {
            System.out.println("Digite um numero maior que 0 para ser a potência:");
            np = in.nextInt();
        } while (np <= 0);

        return np;
    }

    static int potencia(int n, int np) {
        if (np == 0) {
            return 1;
        }
        return n * potencia(n, np - 1);
    }
}