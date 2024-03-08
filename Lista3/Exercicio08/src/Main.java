import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro positivo:");
        num = in.nextInt();

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
        } else {
            boolean primo = true;
            for (long i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }
    }
}
