import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n1,n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        System.out.println("Digite outro número inteiro: ");
        n2 = in.nextInt();

        if(n1 > n2) {
            System.out.println("O maior número é: " + n1);
        }

        else {

            System.out.println("O maior número é: " + n2);
        }
    }
}