import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a variavel A:");

        a = in.nextDouble();

        System.out.println("Digite a variavel B:");

        b = in.nextDouble();

        result = -b / a;

        System.out.println("A solução final é:" + result);
    }
}