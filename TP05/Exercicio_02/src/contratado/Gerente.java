package contratado;

public class Gerente extends Empregado {
    private String nome_gerencia;

    public Gerente(String nome){
        super(nome);
    }

    public String getNome_gerencia() {
        return nome_gerencia;
    }

    public void setNome_gerencia(String nome_gerencia) {
        this.nome_gerencia = nome_gerencia;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatricula: " + getMatricula() +
                "\nNome da loja: " + nome_gerencia + "\nValor do INSS: " + valorInss(getSalario());
    }
}
