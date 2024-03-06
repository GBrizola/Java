import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        long fatorial;

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        num = in.nextInt();

        if (num < 0) {
            System.out.println("O fatorial de números negativos não é definido.");
        } else {
            fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        }
    }
}
