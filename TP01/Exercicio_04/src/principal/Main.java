package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor_venda[][] = new int[12][4];
        int soma;

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite as vendas do mês " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("Semana " + (j + 1));
                valor_venda[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 12; i++) {
            soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += valor_venda[i][j];
            }
            System.out.println("Mês " + (i + 1) + "| Venda: " + soma);
        }

        for (int i = 0; i < 4; i++) {
            soma = 0;
            for (int j = 0; j < 12; j++) {
                soma += valor_venda[j][i];
            }
            System.out.println("Semana " + (i + 1) + "| Venda " + soma);
        }

        soma=0;
        for(int i=0; i < 12; i++){
            for(int j=0; j < 4; j++){
                soma += valor_venda[i][j];
            }
        }
        System.out.println("Total de vendas do ano: " + soma);
    }
}