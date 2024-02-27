import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cafe, parc;
        double valorDin, valorCafe, totalPag;

        System.out.println("Insira o dinheiro: ");
        valorDin = in.nextDouble();

        System.out.println("1. Café Expresso R$ 0,50\n2. Café Longo R$ 1,00\n3. Capuccino R$ 2,50\n4. Chocolate R$ 2,00\n\nEscolha uma opção: ");
        cafe = in.nextInt();

        switch (cafe){

            default:
                System.out.println("Opção inválida!");
                return;

            case 1:
                System.out.println("Bebida selecionada:Café Expresso");
                valorCafe = 0.5;
                totalPag = valorDin - valorCafe;
                System.out.println("Seu troco: R$" + totalPag);
                break;

            case 2:
                System.out.println("Bebida selecionada:Café Longo");
                valorCafe = 1;
                totalPag = valorDin - valorCafe;
                System.out.println("Seu troco: R$" + totalPag);
                break;

            case 3:
                System.out.println("Bebida selecionada:Capuccino");
                valorCafe = 2.5;
                totalPag = valorDin - valorCafe;
                System.out.println("Seu troco: R$" + totalPag);
                break;

            case 4:
                System.out.println("Bebida selecionada:Chocolate");
                valorCafe = 2;
                totalPag = valorDin - valorCafe;
                System.out.println("Seu troco: R$" + totalPag);
                break;
        }
    }
}