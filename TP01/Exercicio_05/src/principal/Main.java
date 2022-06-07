package principal;

import java.util.Scanner;

public class Main {
    public static void exibe_matriz(int matriz[][]) {
        System.out.println("Matriz digitada");

        System.out.print("[");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            if (i == 2) {
                System.out.print("]");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        System.out.println("Preencha a matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Linha " + (i + 1) + " Coluna " + (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        exibe_matriz(matriz);

        System.out.println("Matriz formatada");

        System.out.print("[");
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(matriz[j][i] + " ");
            }

            if (i == 2) {
                System.out.print("]");
            }

            System.out.println();
        }
    }
}
