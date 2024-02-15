import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double n1 ,n2 ,resultn1, resultn2, result, resultf;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");

        n1 = in.nextInt();

        System.out.println("Digite a segunda nota:");

        n2 = in.nextInt();

        resultn1 = n1 * 1;

        resultn2 = n2 * 2;

        result = resultn1 + resultn2;

        resultf = result / 3;

        System.out.println("A média da nota é:" + resultf);


    }
}