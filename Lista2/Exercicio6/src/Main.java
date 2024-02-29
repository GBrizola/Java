import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escolha uma opção entre 5 e 9: ");
        int op;

        op = in.nextInt();

        if (op >= 5 && op <= 9) {
            System.out.println("Você escolheu a opção: " + op);
        }
        else {
            System.out.println("Opção inválida. Por favor, escolha um número entre 5 e 9.");
            }
        }
    }

