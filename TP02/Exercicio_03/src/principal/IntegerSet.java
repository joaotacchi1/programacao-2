package principal;

public class IntegerSet {
    private boolean conjunto[];

    public IntegerSet() {
        this.conjunto = new boolean[10];
    }

    private IntegerSet(boolean values[]) {
        this.conjunto = values;
    }

    public IntegerSet uniao(IntegerSet conjunto2) {
        boolean uniao[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            uniao[i] = this.conjunto[i] || conjunto2.conjunto[i];
        }
        return new IntegerSet(uniao);
    }

    public IntegerSet intersecao(IntegerSet conjunto2) {
        boolean intersecao[] = new boolean[10];
        for (int i = 0; i < 10; i++) {
            intersecao[i] = this.conjunto[i] && conjunto2.conjunto[i];
        }
        return new IntegerSet(intersecao);
    }

    public boolean diferenca(IntegerSet conjunto2) {
        for (int i = 0; i < 10; i++) {
            if (this.conjunto[i] != conjunto2.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    public void insereElemento(int num) {
        this.conjunto[num] = true;
    }

    public void deletaElemento(int num) {
        this.conjunto[num] = false;
    }

    public String[] converte_string() {
        String str[] = new String[10];
        int cont = 0;

        for (int i = 0; i < str.length; i++) {
            if (this.conjunto[i] == true) {
                str[cont] = Integer.toString(i);
                cont++;
            }
        }
        return str;
    }

}
