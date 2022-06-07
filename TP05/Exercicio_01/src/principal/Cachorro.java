package principal;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca, double peso) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nRaça: " + raca + "\nPeso: " + getPeso() + "kg";
    }
}
