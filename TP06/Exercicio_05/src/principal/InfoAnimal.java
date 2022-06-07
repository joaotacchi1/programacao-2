package principal;

public class InfoAnimal implements Animal {
    private String nome;
    private String especie;

    public InfoAnimal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public String getNomeEspecie() {
        return especie;
    }

    @Override
    public String getNomeAnimal() {
        return nome;
    }
}

