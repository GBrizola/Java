import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double a, b, result, conta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a variavel A:");

        a = in.nextInt();

        System.out.println("Digite a variavel B:");

        b = in.nextInt();

        conta = (-b / a);
        result = (conta);


        System.out.println("A solução final é:" + result);


    }
}