import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double base, altura, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base do triângulo retângulo: ");
        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo: ");
        altura = in.nextDouble();

        result = base * altura / 2;

        System.out.println("A sua área é: " + result);


    }
}