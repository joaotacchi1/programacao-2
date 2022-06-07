package principal;

import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {

    }

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "Nome do DVD: " + getNome();
    }

    @Override
    public String getDetalhes() {
        System.out.println("Mostra capa do DVD\nNome:" + getNome());
        return super.getDetalhes() + "\nNúmero de faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    @Override
    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();

        System.out.println("Número de faixas: ");
        setFaixas(sc.nextInt());

    }


}
