package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome[] = new String[50];
        int estoque_ideal[] = new int[50];
        int qtd_estoque[] = new int[50];
        int estoque_final[] = new int[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Nome da planta: ");
            nome[i] = scan.nextLine();
            System.out.println("Estoque ideal: ");
            estoque_ideal[i] = scan.nextInt();
            System.out.println("Quantidade atual em estoque: ");
            qtd_estoque[i] = scan.nextInt();
            scan.nextLine();
            System.out.println();
        }

        for (int i = 0; i < 50; i++) {
            estoque_final[i] = estoque_ideal[i] - qtd_estoque[i];

            if (estoque_final[i] > 0) {
                System.out.print("Planta: " + nome[i] + " | ");
                System.out.println("Quantidade a ser comprada: " + estoque_final[i]);
            } else {
                System.out.println("Não necessita comprar nenhuma(nenhum) " + nome[i] + " nova(o)!!");
            }

        }

    }
}
