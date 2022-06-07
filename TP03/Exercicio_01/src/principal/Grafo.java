package principal;

public class Grafo {
    private int grafos[][];

    public Grafo() {
        grafos = new int[][]{{0, 1, 0, 0, 1}, {1, 0, 1, 1, 1}, {0, 1, 0, 1, 0}, {0, 1, 1, 0, 1}, {1, 1, 0, 1, 0}};
    }

    public void vertice(int x, int y) {
        if ((x > 5 || x < 0) && (y > 5 || y < 0)) {
            System.out.println("Não existem esses vertices estabelecidos");
        }

        if (grafos[x - 1][y - 1] == 1) {
            System.out.println("São adjacentes");
        } else {
            System.out.println("Não são adjacentes");
        }
    }

    public void exibe_lista(int x) {
        for (int i = 0; i < 5; i++) {
            if (grafos[i][x-1] == 1) {
                System.out.println("Vértices adjacentes ao número " + x + ": " + (i+1));
            }
        }

    }

}
