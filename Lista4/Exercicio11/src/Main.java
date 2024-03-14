import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas1, linhas2, colunas1, colunas2;

        System.out.println("Digite o número de linhas da primeira matriz: ");
        linhas1 = in.nextInt();
        System.out.println("Digite o número de colunas da primeira matriz: ");
        colunas1 = in.nextInt();

        System.out.println("Digite o número de linhas da segunda matriz: ");
        linhas2 = in.nextInt();
        System.out.println("Digite o número de colunas da segunda matriz: ");
        colunas2 = in.nextInt();

        if (colunas1 != linhas2) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        int[][] matriz1 = new int[linhas1][colunas1];
        int[][] matriz2 = new int[linhas2][colunas2];

        System.out.println("Digite os elementos da primeira matriz: ");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                matriz1[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz: ");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                matriz2[i][j] = in.nextInt();
            }
        }

        int[][] matrizP = new int[linhas1][colunas2];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    matrizP[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println("Matriz produto: ");
        for (int[] i : matrizP) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}