import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, nota, recup, nrecup;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = in.nextDouble();

        nota = (n1 + n2) / 2;
        System.out.println("Nota: " + nota);

        if (nota >= 50) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Digite a nota da recuperação: ");
            recup = in.nextDouble();

            nrecup = (nota + recup) / 2;

            if (nrecup < 50) {
                System.out.println("Reprovado na recuperação!");
            } else {
                System.out.println("Aprovado na recuperação!");
            }
        }
    }
}
