import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite três números inteiros para ordená-los crescentemente: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if (num1 < num2 & num2 < num3) {
            System.out.println("Ordem dos números: " + num1 +", "+ num2 +", "+ num3);
        } else if (num1 < num3 & num3 < num2) {
            System.out.println("Ordem dos números: " + num1 +", "+ num3 +", "+ num2);
        } else if (num2 < num3 & num3 < num1) {
            System.out.println("Ordem dos números: " + num2 +", "+ num3 +", "+ num1);
        } else if (num2 < num1 & num1 < num3) {
            System.out.println("Ordem dos números: " + num2 +", " + num1 + ", " + num3);
        } else if (num3 < num1 & num1 < num2) {
            System.out.println("Ordem dos números: " + num3 +", "+ num1 +", "+ num2);
        } else {
                System.out.println("Ordem dos números: " + num3 +", "+ num2 +", "+ num1);
        }
    }
}
