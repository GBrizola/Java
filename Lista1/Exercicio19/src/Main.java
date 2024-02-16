import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c, x1, x2, delta;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        c = in.nextDouble();

        delta = Math.pow(b, 2) -4 * a * c;

        x1 = (-b + delta) / (2 * a) ;
        x2 = (-b - delta) / (2 * a) ;

        System.out.println("A solução de X1 é: " + x1 + " e a solução de X2 é: " + x2);
    }
}