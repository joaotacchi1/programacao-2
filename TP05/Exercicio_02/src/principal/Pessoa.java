package principal;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null)
            System.out.println("O nome ja foi registrado");
        else
            this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
