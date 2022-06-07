package principal;

public class DiscoOtico extends Dispositivo {

    public DiscoOtico(long c) {
        super(" Disco Otico ", 241172480L);
    }

    public String toString() {
        return " Dispositivo :" + nome + " Capacidade :" + c;
    }
}

//O erro ocorre pois a subclasse DiscoOtico não faz um método obrigatório definido pela classe pai, que seria o método
//"abstract public double capacidadeEmMegabytes", causando o erro. Além do erro na concatenação do "public String toString",
//pois precisaria dos metodos getters and setters na classe dispositivo, para ai sim chamar eles no DiscoOtico.
