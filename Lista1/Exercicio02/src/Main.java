import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        result = n1 * n1;

        System.out.println("O Quadrado do número digitado é: " + result);
    }
}