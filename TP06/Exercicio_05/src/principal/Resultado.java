package principal;

public class Resultado{
    private String especie;
    private int quantidade;

    public Resultado() {
    }

    public Resultado(String especie, int quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
