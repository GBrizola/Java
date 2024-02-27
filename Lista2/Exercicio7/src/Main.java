import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Digite os coeficientes da equação do segundo grau (ax² + bx + c = 0):");

        System.out.print("Coeficiente a: ");
        a = in.nextDouble();

        System.out.print("Coeficiente b: ");
        b = in.nextDouble();

        System.out.print("Coeficiente c: ");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta > 0) {

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("A única raiz da equação é: x = " + x);
        } else {

            System.out.println("A equação não possui raízes reais.");
        }
    }
}