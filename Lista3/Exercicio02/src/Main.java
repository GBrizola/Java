import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maiorNum, menorNum, num, contador;
        System.out.print("Digite o 1º número inteiro: ");
        maiorNum = in.nextInt();
        menorNum = maiorNum;
        contador = 2;

        while (contador <= 5) {
            System.out.print("Digite o " + contador + "º número inteiro: ");
            num = in.nextInt();
            contador++;

            if (num > maiorNum) {
                maiorNum = num;
            }
            if (num < menorNum) {
                menorNum = num;
            }
        }
        System.out.println("\nO maior número digitado é: " + maiorNum);
        System.out.println("O menor número digitado é: " + menorNum);
    }
}
