package letra_B;


import java.time.LocalDate;
import java.util.Objects;

public class Empregado implements Comparable {
    private String id;
    private String nome;
    private double salario;
    private LocalDate data_contratacao;

    public Empregado(String id, String nome, double salario, LocalDate data_contratacao) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.data_contratacao = data_contratacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(LocalDate data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + " -- ID:" + id + "\nSalario:" + salario
                + "\nData de contratação:" + data_contratacao;
    }

    @Override
    public int compareTo(Object o) {
        Empregado p = (Empregado) o;
        if(this.salario < p.salario){
            return -1;
        }
        if(this.salario > p.salario){
            return 1;
        }
        return 0;
    }
}
