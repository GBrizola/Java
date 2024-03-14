import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vector = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro para buscar no vetor: ");
        int value = in.nextInt();
        boolean found = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == value) {
                System.out.println("Valor " + value + " encontrado na posição " + i);
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Valor não encontrado!");
    }
}
