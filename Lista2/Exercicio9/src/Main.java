import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Digite o comprimento dos três lados do triângulo:");
        lado1 = in.nextDouble();
        lado2 = in.nextDouble();
        lado3 = in.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("É um triângulo isósceles.");

        } else if (lado1 != lado2 & lado2 != lado3) {
            System.out.println("É um triângulo escaleno.");
        } else {
            System.out.println("Não é possível formar um triângulo com os comprimentos dados.");
        }
    }
}