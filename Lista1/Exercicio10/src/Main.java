import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double distancia ,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em milhas:");

        distancia = in.nextInt();

        result = (distancia * 1.609);

        System.out.println("A Conversão é:" + result + " quilômetros");


    }
}