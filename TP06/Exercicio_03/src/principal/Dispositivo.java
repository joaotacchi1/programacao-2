package principal;

public abstract class Dispositivo {
    private String nome;
    private long capacidadeEmBytes ;

    public Dispositivo ( String n , long c ) {
        nome = n ;
        capacidadeEmBytes = c ;
    }

    abstract public String toString () ;
    abstract public double capacidadeEmMegabytes () ;
}
