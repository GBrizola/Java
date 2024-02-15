import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double distancia ,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em quilômetros: ");

        distancia = in.nextDouble();

        result = distancia / 1.609;

        System.out.println("A Conversão é: " + result + " milhas");


    }
}