import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double n1,n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = in.nextDouble();

        if((n1 + n2) / 2 >= 50) {
            System.out.println("Aprovado!");
        }

        else {

            System.out.println("Reprovado!");
        }
    }
}