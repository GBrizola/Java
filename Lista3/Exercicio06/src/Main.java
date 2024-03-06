import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2, maiorNum, menorNum;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = in.nextInt();

        menorNum = Math.min(num1, num2);
        maiorNum = Math.max(num1, num2);

        System.out.println("Números entre " + menorNum + " e " + maiorNum + ":");
        for (int i = menorNum + 1; i < maiorNum; i++) {
            System.out.println(i);
        }
    }
}
