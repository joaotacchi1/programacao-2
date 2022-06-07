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
            ContaException c = new ContaException("\nSaldo atual = R$" + qtd_dinheiro + "\nValor do saque requisitado = " +
                    dinheiro + "\nImpossível sacar essa quantia, pois você não possui ela");/*parte modificada em relação
                    ao código anterior*/
            throw c;
        }

        this.qtd_dinheiro = this.qtd_dinheiro - dinheiro;
        return this.qtd_dinheiro;
    }

    @Override
    public String toString() {
        return "Quantidade de dinheiro:R$" + qtd_dinheiro + "\nLimite:R$" + limite;
    }
}
