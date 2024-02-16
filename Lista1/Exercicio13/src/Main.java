import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double raio, rr;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        raio = in.nextDouble();

        rr = Math.pow(raio, 2) * Math.PI;

        System.out.println("A sua área é: " + rr);


    }
}