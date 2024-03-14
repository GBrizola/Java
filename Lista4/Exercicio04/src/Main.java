import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int [] maior = new int[2];
        int [] menor = new int[2];

        Scanner in = new Scanner(System.in);


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiros no vetor: ");
            vetor[i] = in.nextInt();
        }
        menor[0] = vetor[0];
        maior[0] = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor[0]) {
                menor[0] = vetor[i];
                menor[1] = i;
            }

            if (vetor[i] > maior[0]) {
                maior[0] = vetor[i];
                maior[1] = i;
            }
        }
        System.out.println("Menor número: " + menor[0]);
        System.out.println("Indice do vetor do menor número: " + menor[1] + "\n");
        System.out.println("Maior número: " + maior[0]);
        System.out.println("Indice do vetor do maior número: " + maior[1]);
        }
    }
