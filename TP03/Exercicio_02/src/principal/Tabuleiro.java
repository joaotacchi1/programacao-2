package principal;

public class Tabuleiro {
    private int[][] grade = new int[3][3];

    public Tabuleiro() {
        zeraTabuleiro();
    }

    public void zeraTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = 0;
            }
        }
    }

    public void exibeTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 || j == 1) {
                    System.out.print(grade[i][j] + " | ");
                } else {
                    System.out.print(grade[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int checa_vencedor() {
        for (int i = 0; i < 3; i++) {
            if (grade[i][0] == grade[i][1] && grade[i][0] == grade[i][2]) {
                return grade[i][0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (grade[0][j] == grade[1][j] && grade[0][j] == grade[2][j]) {
                return grade[0][j];
            }
        }

        if (grade[0][0] == grade[1][1] && grade[0][0] == grade[2][2]) {
            return grade[0][0];
        }
        if (grade[0][2] == grade[1][1] && grade[0][2] == grade[2][0]) {
            return grade[0][2];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == 0) {
                    return 0;
                }

            }
        }

        return 3;
    }

    public boolean jogada(int jogador, int i, int j) {
        if (i < 0 || i > 2) {
            return false;
        }

        if (j < 0 || j > 2) {
            return false;
        }

        if (grade[i][j] != 0) {
            return false;
        }

        grade[i][j] = jogador;

        return true;
    }

}
