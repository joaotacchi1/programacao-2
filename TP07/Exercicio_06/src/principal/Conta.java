package principal;

public class Conta {
    private double qtd_dinheiro = 0;
    private double limite;

    public double deposita(double dinheiro){
        this.qtd_dinheiro += dinheiro;
        return this.qtd_dinheiro;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double saca(double dinheiro) throws ContaException {
        if(this.qtd_dinheiro < dinheiro){
            ContaException c = new ContaException("Pedido de saque maior do que o saldo");
            throw c;
        }

        this.qtd_dinheiro = this.qtd_dinheiro - dinheiro;
        return this.qtd_dinheiro;
    }

    @Override
    public String toString() {
        return "Quantidade de dinheiro:" + qtd_dinheiro + "\nLimite:" + limite;
    }
}
