import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double velIni, acel, temp, result, conta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial:");

        velIni = in.nextInt();

        System.out.println("Digite a aceleração:");

        acel = in.nextInt();

        System.out.println("Digite o tempo de percurso:");

        temp = in.nextInt();

        conta = acel * temp;
        result = velIni + conta;


        System.out.println("A sua velocidade final é:" + result);


    }
}