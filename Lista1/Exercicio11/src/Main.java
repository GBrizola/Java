import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double temperatura ,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");

        temperatura = in.nextInt();

        result = temperatura * 1.8 + 32;

        System.out.println("A Conversão é:" + result + " Fahrenheit");


    }
}