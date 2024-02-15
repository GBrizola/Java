import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double base, altura, result, conta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triângulo retângulo:");

        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo:");

        altura = in.nextDouble();

        conta = base * altura;

        result = conta / 2;



        System.out.println("A sua área é:" + result);


    }
}