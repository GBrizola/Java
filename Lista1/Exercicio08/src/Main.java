import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double medida ,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida em polegadas:");

        medida = in.nextInt();

        result = medida * 25.4;

        System.out.println("A Conversão é:" + result + " milimetros");


    }
}