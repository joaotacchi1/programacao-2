package principal;

public class Produto {
    private String identificacao;
    private double custoDeFabricacao;

    Produto(String i, double c){
        identificacao = i;
        custoDeFabricacao = c;
    }

    abstract public String toString();
    abstract public void novoCusto(double nc);
}

//O erro ocorre devido ao fato de que para os métodos serem abstratos, a classe Produto também deveria ser abstrata.
