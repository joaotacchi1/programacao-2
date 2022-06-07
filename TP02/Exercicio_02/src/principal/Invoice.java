package principal;

public class Invoice {
    private int num_prod;
    private String descricao;
    private int qtd_comprada;
    private double valor_unitario;
    private double invoice_amount;

    public void setNum_prod(int num_prod) {
        this.num_prod = num_prod;
    }

    public int getNum_prod() {
        return this.num_prod;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setQtd_comprada(int qtd_comprada) {
        if (qtd_comprada < 0) {
            qtd_comprada = 0;
        }

        this.qtd_comprada = qtd_comprada;
    }

    public int getQtd_comprada() {
        return this.qtd_comprada;
    }

    public void setValor_unitario(double valor_unitario) {
        if (valor_unitario < 0) {
            valor_unitario = 0.0;
        }

        this.valor_unitario = valor_unitario;
    }

    public double getValor_unitario() {
        return this.valor_unitario;
    }

    public double getInvoice_amount() {
        invoice_amount = this.qtd_comprada * this.valor_unitario;
        return invoice_amount;
    }

}
