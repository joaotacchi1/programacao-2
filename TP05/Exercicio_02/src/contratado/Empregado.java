package contratado;

import principal.Pessoa;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome){
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double valorInss(double salario){
        double salario_final;
        salario_final = salario * 0.11;
        return salario_final;
    }
}
