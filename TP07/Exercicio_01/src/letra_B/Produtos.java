package letra_B;

public class Produtos{

    private String ID;
    private String nome;
    private double preco;

    public Produtos(String nome, double preco, String ID) {
        this.nome = nome;
        this.preco = preco;
        this.ID = ID;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Produtos:" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", preco=R$" + preco;
    }

    @Override
    public boolean equals(Object o) {
        Produtos p = (Produtos) o;
        if(this.getID().equals(p.getID())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.getID());
    }
}
