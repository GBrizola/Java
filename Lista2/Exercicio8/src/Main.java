import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro:");
        num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }
    }
}
