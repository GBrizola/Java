import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double raio, rr, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do circulo:");

        raio = in.nextInt();

        rr = (raio * raio);

        result = (rr * 3.14);



        System.out.println("A sua área é:" + result);


    }
}