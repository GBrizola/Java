import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        double base , altura, r, perimetro, area, l1, l2, l3, a, b;

        System.out.println("\nMENU:\n1.Círculo\n2.Triangulo Retângulo\n3.Retângulo\n");
        System.out.println("Escolha uma opção: ");
        op = in.nextInt();

        switch (op){
            default:
                System.out.println("Opção de pagamento inválida!");
                return;
            case 1:
                System.out.println("Circulo");
                System.out.println("Informe o raio do circulo: ");
                r = in.nextDouble();
                perimetro = 2 * Math.PI * r;
                area = Math.PI * r * r;
                System.out.println("Área: " + area + " Perimetro: " + perimetro);
                break;
            case 2:
                System.out.println("Triangulo Retângulo");
                System.out.println("Digite a base: ");
                base = in.nextDouble();
                System.out.println("Digite a altura: ");
                altura = in.nextDouble();
                area = (base * altura) / 2;
                System.out.println("Informe os comprimentos dos lados do triangulo retângulo: ");
                l1 = in.nextDouble();
                l2 = in.nextDouble();
                l3 = in.nextDouble();
                perimetro = l1 + l2 + l3;
                System.out.println("Área: " + area + " Perimetro: " + perimetro);
                break;
            case 3:
                System.out.println("Retângulo");
                System.out.println("Informe a base: ");
                base = in.nextDouble();
                System.out.println("Informe a altura: ");
                altura = in.nextDouble();
                System.out.println("Informe o valor do lado a: ");
                a = in.nextDouble();
                System.out.println("Informe o valor do lado b: ");
                b = in.nextDouble();
                area = base * altura;
                perimetro = a * a + b * b;
                System.out.println("Área: " + area + " Perimetro: " + perimetro);
                break;

        }
    }
}