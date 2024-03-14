public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matriz2 = {{2, 3}, {4, 5}};
        int[][] matrizP = new int[3][2];

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 2; ++j) {
                matrizP[i][j] = matriz1[i][0] * matriz2[0][j] + matriz1[i][1] * matriz2[1][j];
            }
        }
        for (int[] i : matrizP) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}