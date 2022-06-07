package principal;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabuleiro t1 = new Tabuleiro();
        int jogador = 1, vencedor = t1.checa_vencedor(), linha, coluna;

        while (vencedor == 0) {
            System.out.println("Jogador " + jogador);
            System.out.println("Digite a linha entre 1 e 3 para jogar");
            linha = sc.nextInt();
            System.out.println("Digite a coluna entre 1 e 3 para jogar");
            coluna = sc.nextInt();
            if (t1.jogada(jogador, linha - 1, coluna - 1) == false) {
                System.out.println("Jogada inválida");
            } else {
                if (jogador == 1) {
                    jogador = 2;
                } else {
                    jogador = 1;
                }
            }
            t1.exibeTabuleiro();
            vencedor = t1.checa_vencedor();
        }

        if (vencedor == 1) {
            System.out.println("Jogador 1 venceu");
        } else {
            if (vencedor == 2) {
                System.out.println("Jogador 2 venceu");
            } else {
                if (vencedor == 3) {
                    System.out.println("Empate");
                }

            }
        }

    }
}
