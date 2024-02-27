import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        double num1 , num2, resultado;
        System.out.println("Digite um número: ");
        num1 = in.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = in.nextDouble();

        System.out.println("\nMENU:\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n");
        System.out.println("Escolha uma opção: ");
        op = in.nextInt();

        switch (op){
            default:
                System.out.println("Opção de pagamento inválida!");
                return;
            case 1:
                System.out.println("Soma");
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 +" + "+ num2 + " = " + resultado);
                break;
            case 2:
                System.out.println("Subtração");
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 +" - "+ num2 + " = " + resultado);
                break;
            case 3:
                System.out.println("Multiplicação");
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 +" x "+ num2 + " = " + resultado);
                break;
            case 4:
                System.out.println("Divisão");
                resultado = num1 / num2;
                System.out.println("Resultado: " + num1 +"÷"+ num2 + "=" + resultado);
                break;
        }
    }
}