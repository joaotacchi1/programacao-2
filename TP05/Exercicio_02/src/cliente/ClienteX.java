package cliente;

import principal.Pessoa;

public class ClienteX extends Pessoa {
    private double valorDivida;
    private int anoNasc;

    public ClienteX(String nome) {
        super(nome);
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo() +
                "\nValor da divida: " + valorDivida + "\nAno de nascimento: " + anoNasc;
    }


}
