import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double velIni, acel, temp, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");

        velIni = in.nextDouble();

        System.out.println("Digite a aceleração: ");

        acel = in.nextDouble();

        System.out.println("Digite o tempo de percurso: ");

        temp = in.nextDouble();

        result = velIni + acel * temp;

        System.out.println("A sua velocidade final é: " + result);


    }
}