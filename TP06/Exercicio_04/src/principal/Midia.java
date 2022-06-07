package principal;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){

    }

    public Midia(int c, double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo(){
        return "Nome da midia: " + this.nome;
    }

    public String getDetalhes(){
        return "\nCodigo: " + this.codigo + "\nPreço:R$" + this.preco;
    }

    public void printDados(){
        String exibe_dados = getTipo() + getDetalhes();
        System.out.println(exibe_dados);
    }

    public void inserirDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        setNome(sc.nextLine());
        System.out.println("Preço:");
        setPreco(sc.nextDouble());
        System.out.println("Codigo:");
        setCodigo(sc.nextInt());
    }

}
