import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mult, resposta, resultEsp, jogarDnv;

        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println("Tabuada do " + tabuada + ":");

            for (int i = 1; i <= 10; i++) {
                mult = i;
                resultEsp = tabuada * mult;

                System.out.print(tabuada + " x " + mult + " = ");
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
