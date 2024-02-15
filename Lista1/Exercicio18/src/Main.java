import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a variavel A:");

        a = in.nextInt();

        System.out.println("Digite a variavel B:");

        b = in.nextInt();

        result = -b / a;

        System.out.println("A solução final é:" + result);
    }
}