import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double raio, altura, result, conta, conta2, conta3;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro:");

        raio = in.nextInt();

        System.out.println("Digite a altura do cilindro:");

        altura = in.nextInt();

        conta = (raio * raio);
        conta2 = (3.14 * conta);
        conta3 = (conta2 * altura);

        result = (conta3 / 3);



        System.out.println("O seu Volume é:" + result);


    }
}