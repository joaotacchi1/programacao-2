package lanchonete;

public class Sanduiche {
    private String pao;
    private String presunto;
    private String queijo;
    private String salada;

    protected Sanduiche(String pao, String presunto, String queijo, String salada) {
        this.pao = pao;
        this.presunto = presunto;
        this.queijo = queijo;
        this.salada = salada;
    }

    public String getPao() {
        return pao;
    }

    public String getPresunto() {
        return presunto;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getSalada() {
        return salada;
    }

    @Override
    public String toString() {
        return "Pao:" + pao + "\nPresunto: " + presunto + "\nQueijo: " + queijo
                + "\nSalada: " + salada;
    }
}
