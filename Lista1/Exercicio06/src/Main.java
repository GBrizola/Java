import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double velocidade ,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade em M/s:");

        velocidade = in.nextInt();

        result = velocidade * 3.6;

        System.out.println("A Conversão é:" + result + " Km/h");


    }
}