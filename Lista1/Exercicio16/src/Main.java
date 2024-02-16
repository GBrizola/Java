import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double raio, altura, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do cone:");
        raio = in.nextDouble();

        System.out.println("Digite a altura do cone: ");
        altura = in.nextDouble();

        result = Math.pow(raio, 2) * Math.PI * altura / 3;

        System.out.println("O seu Volume é: " + result);


    }
}