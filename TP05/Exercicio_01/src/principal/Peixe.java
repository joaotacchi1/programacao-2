package principal;

public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso) {
        super(nome, peso);
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nPeso: " + getPeso() + "kg" + "\nHabitat do peixe:" + tipoHabitat;
    }
}
