public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0},{0,9,8,7,6},{5,4,3,2,1}};
        int maiorSomaColunas = Integer.MIN_VALUE, maiorSomaLinhas = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0, somaColuna = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinhas)
                maiorSomaLinhas = somaLinha;

            if (somaColuna > maiorSomaColunas)
                maiorSomaColunas = somaColuna;
        }
        System.out.println("Maior soma entre as colunas: " + maiorSomaColunas);
        System.out.println("Maior soma entre as linhas: " + maiorSomaLinhas);
    }
}
