package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo grafo = new Grafo();
        int x, y, x_da_Lista;

        System.out.println("Digite os vertices que quer comparar se são adjacentes");
        x = sc.nextInt();
        y = sc.nextInt();
        grafo.vertice(x,y);

        System.out.println("Digite o vértice que quer saber seus adjacentes");
        x_da_Lista = sc.nextInt();
        grafo.exibe_lista(x_da_Lista);
    }
}
