package principal;

public class Funcionario{
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        Funcionario f = (Funcionario) o;
        if(this.getNome().equals(f.getNome())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCargo: " + cargo
                + "\nSalario: R$" + salario + "(em milhões)";
    }
}
