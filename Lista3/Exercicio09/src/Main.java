import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mult, resposta, resultEsp, jogarDnv;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                resultEsp = i * j;

                System.out.print(i + " x " + j + " = ");
                resposta = in.nextInt();

                if (resposta != resultEsp) {
                    System.out.println("Você errou! Fim de jogo.");
                    return;
                }
            }
        }
        System.out.println("Parabéns! Você ganhou!");

        System.out.println("Deseja jogar novamente?\n1.Sim\n2.Não");
        jogarDnv = in.nextInt();

        if (jogarDnv == 1) {
            main(null);
        } else if (jogarDnv == 2){
            System.out.println("Obrigado por jogar!");
        } else {
            System.out.println("Opção Inválida!");
        }
    }
}
