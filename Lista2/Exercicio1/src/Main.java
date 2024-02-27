import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double n, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número real positivo para imprimir sua raiz: ");
        n = in.nextDouble();

        if(n < 0) {
            System.out.println("Valor inválido!");
        }

        else {

            result = Math.sqrt(n);

            System.out.println("A resposta da raiz é: " + result);
        }
    }
}