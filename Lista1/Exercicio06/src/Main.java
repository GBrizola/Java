import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double vkm ,vms;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade em M/s: ");

        vms = in.nextDouble();

        vkm = vms * 3.6;

        System.out.println("A Conversão é: " + vkm + "Km/h");


    }
}