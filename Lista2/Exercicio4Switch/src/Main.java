import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int formaPag, parc;
        double valorCompra, totalPag;

        System.out.println("Insira o valor da compra: ");
        valorCompra = in.nextDouble();

        System.out.println("Menu:\n1. Débito\n2. PIX\n3. Crédito\n\nEscolha a forma de pagamento: ");
        formaPag = in.nextInt();

        switch (formaPag){
            default:
                System.out.println("Opção de pagamento inválida!");
                return;
            case 1:
                System.out.println("Débito selecionado");
                totalPag = valorCompra * 0.95;
                System.out.println("Valor final da compra: R$" + totalPag);
                break;

            case 2:
                System.out.println("PIX selecionado");
                totalPag = valorCompra * 0.9;
                System.out.println("Valor final da compra: R$" + totalPag);
                break;

            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas: ");
                parc = in.nextInt();
                if (parc <= 4){
                    totalPag = valorCompra+valorCompra*0.02;
                    System.out.println("Valor final da compra: R$" + totalPag);
                    break;
                }else {
                    totalPag = valorCompra+valorCompra*0.05;
                    System.out.println("Valor final da compra: R$" + totalPag);
                    break;
                }
        }
    }
}