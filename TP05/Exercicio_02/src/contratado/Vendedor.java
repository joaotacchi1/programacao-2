package contratado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qtdVendas;

    public Vendedor(String nome){
        super(nome);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nSalário:R$ " + getSalario() + "\nValor total das vendas:R$ " + valorVendas +
                "\nQuantidade de itens vendidos:" + qtdVendas;
    }
}
