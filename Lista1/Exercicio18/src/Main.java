import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, x;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        b = in.nextDouble();

        x = -b / a;

        System.out.println("A solução final de X é: " + x);
    }
}