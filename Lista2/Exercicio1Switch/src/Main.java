import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Digite uma das opções para informar o dia da semana: \n 1 - Domingo \n 2 - Segunda-Feira \n 3 - Terça-Feira" +
                "\n 4 - Quarta-Feira \n 5 - Quinta-Feira \n 6 - Sexta-Feira \n 7 - Sábado");
        valor = in.nextInt();

        switch (valor){
            default:
                System.out.println("Opção de pagamento inválida!");
                return;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}