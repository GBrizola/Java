import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double raio, altura, result, conta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro:");

        raio = in.nextDouble();

        System.out.println("Digite a altura do cilindro:");

        altura = in.nextDouble();

        conta = raio * raio;

        result = 3.14 * conta * altura;

        System.out.println("O seu Volume é:" + result);


    }
}